import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class _8B_PersonalDetailsApplet extends Applet implements ActionListener {
    //        ^ remove this _8B_ before runninng from every where
    //         if this does not work use _7B_ same codes
    // Correctly initialize and declare string variables
    String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "";

    public void init() {
        setLayout(null);
        setSize(400, 300);

        Button btn = new Button("CLICK HERE FOR MY PERSONAL DETAILS");
        add(btn);
        btn.setBounds(20, 50, 300, 30);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        s1 = "Full Name: Aishwarya Rao";
        s2 = "Father Name: Ranjit Mother Name: Vijetha Age: 19";
        s3 = "Roll No: BNU35628 College Name: Jain Degree College";
        s4 = "Nationality: Indian Contact No: 9999988888";
        s5 = "Address: 7th Cross, Indira Nagar, Bangalore";
        repaint();
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 14));
        g.drawString(s1, 20, 110);
        g.drawString(s2, 20, 140);
        g.drawString(s3, 20, 180);
        g.drawString(s4, 20, 220);
        g.drawString(s5, 20, 260);
    }
}

/* 
*<applet code="PersonalDetailsApplet.class" height="400" width="400"> </applet>

*/