import java.awt.*;
import java.awt.event.*;

public class _11B_MouseListenerExample implements MouseListener {
    //        ^ remove this _11B_ before runninng from every where

    // Create two labels
    Label lbl1, lbl2;

    // Create a frame
    Frame fr;

    _11B_MouseListenerExample() {
        fr = new Frame("Java Mouse Listener Example");

        lbl1 = new Label("Demo for the Mouse Event", Label.CENTER);
        lbl2 = new Label();

        // Set the layout of the frame as FlowLayout
        fr.setLayout(new FlowLayout());

        // Add labels to the frame
        fr.add(lbl1);
        fr.add(lbl2);

        // Register the created class MouseListenerExample with MouseListener
        fr.addMouseListener(this);

        // Set the size of frame
        fr.setSize(250, 250);

        // Set the visibility of the frame as true
        fr.setVisible(true);
    }

    // Implementation of mouseClicked method
    public void mouseClicked(MouseEvent ev) {
        lbl2.setText("Mouse Button Clicked");
    }

    // Implementation of mouseEntered method
    public void mouseEntered(MouseEvent ev) {
        lbl2.setText("Mouse has entered the area of the window");
    }

    // Implementation of mouseExited method
    public void mouseExited(MouseEvent ev) {
        lbl2.setText("Mouse has left the area of the window");
    }

    // Implementation of mousePressed method
    public void mousePressed(MouseEvent ev) {
        lbl2.setText("Mouse button is being pressed");
    }

    // Implementation of mouseReleased method
    public void mouseReleased(MouseEvent ev) {
        lbl2.setText("Mouse Released");
    }

    // Main method
    public static void main(String args[]) {
        new _11B_MouseListenerExample();
    }
}
