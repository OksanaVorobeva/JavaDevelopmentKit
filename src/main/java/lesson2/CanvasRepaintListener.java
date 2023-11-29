package lesson2;

import java.awt.*;

public interface CanvasRepaintListener {
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime);
}
