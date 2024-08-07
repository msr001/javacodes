import java.awt.*;
import java.awt.event.*;

public class _6B_ButtonClickActionEvents {
    //        ^ remove this _6B_ before runninng from every where

    public static void main(String[] args) {

        Frame f = new Frame("Button Event");

        Label label1 = new Label("DETAILS OF PARENTS");
        label1.setFont(new Font("Calibri", Font.BOLD, 16));

        Label nl = new Label();
        Label dl = new Label();
        Label al = new Label();

        label1.setBounds(20, 20, 500, 50);
        nl.setBounds(20, 110, 500, 30);
        dl.setBounds(20, 150, 500, 30);
        al.setBounds(20, 190, 500, 30);

        Button mb = new Button("Mother");
        mb.setBounds(20, 70, 50, 30);
        mb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nl.setText("NAME: Aishwarya");
                dl.setText("DESIGNATION: Professor");
                al.setText("AGE: 42");
            }
        });

        Button fb = new Button("Father");
        fb.setBounds(80, 70, 50, 30);
        fb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nl.setText("NAME: Ram");
                dl.setText("DESIGNATION: Manager");
                al.setText("AGE: 44");
            }
        });

        // Adding elements to the frame
        f.add(mb);
        f.add(fb);
        f.add(label1);
        f.add(nl);
        f.add(dl);
        f.add(al);

        // Setting size, layout and visibility
        f.setSize(300, 300); // Increased size for better visibility
        f.setLayout(null);
        f.setVisible(true);
    }
}