package lesson2Kostik.circles.view;

import lesson2Kostik.common.MainCanvas;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainListener extends MouseAdapter {
    private MainWindow mainWindow;

    public MainListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton()==MouseEvent.BUTTON1){
            mainWindow.removeSprite();
        }else if (e.getButton()==MouseEvent.BUTTON3){
            mainWindow.addSprite(e.getX(),e.getY());
        }
    }


    }

