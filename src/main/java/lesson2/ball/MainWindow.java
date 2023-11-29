
package lesson2.ball;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame implements CanvasRepaintListener {
    private static final int WINDOW_HEIGHT = 600;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_POSX = 400;
    private static final int WINDOW_POSY = 200;
    private final Sprite[] sprites = new Sprite[10];
    private final Interactable [] interactables= new Interactable[10];


    private MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_POSX,WINDOW_POSY,  WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");
        for (int i = 0; i < sprites.length; i++) {
            sprites[i]=new Ball();
        }
        MainCanvas canvas=new MainCanvas(this);
        add(canvas);
        setVisible(true);
    }

    public void onDrawFrame(MainCanvas canvas, Graphics g,float deltaTime){
        update(canvas,deltaTime);
        render(canvas,g);
    }

    private void update(MainCanvas canvas,float deltaTime){
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas,deltaTime);
        }
    };
    private void render(MainCanvas canvas,Graphics g){
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    };

    public static void main(String[] args) {
        new MainWindow();
    }
}

