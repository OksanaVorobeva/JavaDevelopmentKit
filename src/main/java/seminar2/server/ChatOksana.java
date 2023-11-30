package seminar2.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;


public class ChatOksana extends JFrame {
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 700;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    JButton btnSend = new JButton("Отправить: ");
    JButton btbStart = new JButton("Начать:");
    JLabel lblLogin = new JLabel("Login: ");
    JLabel lblPassword = new JLabel("Password: ");
    JLabel lblIP = new JLabel("IP: ");
    JLabel lblMessage = new JLabel("Message: ");
    JTextField txtFieldLogin = new JTextField();
    JTextField txtPassword = new JTextField();
    JTextField txtFieldIP = new JTextField();
    JTextField txtFieldMessage = new JTextField();
    JTextArea areaMessage = new JTextArea();
    JPanel panServer = new JPanel(new GridLayout(6, 2));
    JPanel panClient = new JPanel(new GridLayout(6, 1));
    String login;
    String password;
    String IP;
    String message;
    //oldMessage = String.valueOf(read());
    String oldMessage;


    ChatOksana() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ChatWindow");
        setResizable(false);
        panServer.add(lblLogin);
        panServer.add(txtFieldLogin);
        panServer.add(lblPassword);
        panServer.add(txtPassword);
        panServer.add(lblIP);
        panServer.add(txtFieldIP);
        panClient.add(lblMessage);
        panClient.add(areaMessage);
        panClient.add(txtFieldMessage);
        panClient.add(btbStart);
        panClient.add(btnSend);
        areaMessage.setEditable(false);

        btbStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oldMessage = String.valueOf(read());
                areaMessage.append(oldMessage);
            }
        });

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = txtFieldLogin.getText() + ": " + txtFieldMessage.getText() + "\n";
                areaMessage.append(message);
                save(message);
                System.out.println("Отправить сообщение: " + message);
            }
        });

        txtFieldMessage.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    btnSend.doClick();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        setLayout(new GridLayout(2, 1));
        add(panServer);
        add(panClient);
        setVisible(true);
    }


    private void save(String message) {
        try (FileWriter writer = new FileWriter("test1.txt", true);
             BufferedWriter bwr = new BufferedWriter(writer)) {
            bwr.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private StringBuilder read() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader("test1.tst");
             BufferedReader brr = new BufferedReader(reader)) {

            String line = brr.readLine();
            if (line == null || line.isBlank()) {
                System.out.println("Log is empty.");
                return stringBuilder.append("Log is empty.\n");
            }
            while (line != null) {
                if (line.contains(txtFieldLogin.getText())) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                    line = brr.readLine();
                }
            }
            return stringBuilder;

        } catch (IOException ioe) {
            System.out.println("Log file is not found: ");
        }

        return stringBuilder.append("Log file is not found:  ");
    }


    public static void main(String[] args) {
        new ChatOksana();
    }
}



