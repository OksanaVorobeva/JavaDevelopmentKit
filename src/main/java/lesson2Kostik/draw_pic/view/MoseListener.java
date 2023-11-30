package lesson2Kostik.draw_pic.view;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MoseListener extends MouseAdapter {

    private MainWindow mainWindow;

    public MoseListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }


    public void mouseClicked(MouseEvent e) {
        if (e.getButton()==MouseEvent.BUTTON1){
            mainWindow.removeSprite();
        }else if (e.getButton()==MouseEvent.BUTTON3){
            mainWindow.addSprite(e.getX(),e.getY());
        }
    }



}
