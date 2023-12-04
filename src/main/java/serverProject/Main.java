package serverProject;


import serverProject.client.ui.ClientGUI;
import serverProject.server.ui.ServerWindow;

public class Main {
    public static void main(String[] args) {

        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}