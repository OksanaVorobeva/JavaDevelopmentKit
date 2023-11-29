package lesson2.interface2;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

public class MouseAdapter implements MouseListener {
    private static void addMouserListener(MouseListener l){
        l.mouseDown();
        l.mouseUp();
    }
    @Override
    public void mouseUp() {

    }

    @Override
    public void mouseDown() {

    }

    public static void main(String[] args){
        MouseAdapter m = new MouseAdapter();
        addMouserListener(m);
        addMouserListener(new MouseAdapter());
        MouseListener l= new MouseListener() {
            @Override
            public void mouseUp() {

            }

            @Override
            public void mouseDown() {

            }
        };
        addMouserListener(l);
        addMouserListener(new MouseListener() {
            @Override
            public void mouseUp() {

            }

            @Override
            public void mouseDown() {

            }
        });
    }

}
