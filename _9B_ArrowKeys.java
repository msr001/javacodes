import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class _9B_ArrowKeys extends Applet implements KeyListener {
    //        ^ remove this _9B_ before runninng from every where
    int x1 = 100, y1 = 150, x2 = 250, y2 = 200;

    public void init() {
        addKeyListener(this);
        setFocusable(true); // To ensure the applet can receive key events
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
        int key = ke.getKeyCode();

        switch (key) {
            case KeyEvent.VK_LEFT:
                x1 -= 10;
                x2 -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x1 += 10;
                x2 += 10;
                break;
            case KeyEvent.VK_UP:
                y1 -= 10;
                y2 -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y1 += 10;
                y2 += 10;
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        // No action needed
    }

    public void keyTyped(KeyEvent ke) {
        // No action needed
    }

    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawRect(x1, y1 + 160, 100, 50);
        g.drawOval(x1, y1 + 235, 100, 50);
    }
}

// <html>
//     <applet code="ArrowKeys.class" width="400" height="400">
//     </applet>
// </html>
