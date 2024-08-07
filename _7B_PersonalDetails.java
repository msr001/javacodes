import java.awt.*;
import java.awt.event.*;

public class _7B_PersonalDetails {
    //        ^ remove this _7B_ before runninng from every where
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");

        Label l1 = new Label("WELCOME TO MY PAGE");
        l1.setFont(new Font("Calibri", Font.BOLD, 16));

        Label fnl = new Label();
        Label mnl = new Label();
        Label inl = new Label();
        Label rl = new Label();
        Label al = new Label();

        l1.setBounds(250, 30, 600, 50);
        fnl.setBounds(20, 120, 600, 30);
        mnl.setBounds(20, 160, 600, 30);
        inl.setBounds(20, 200, 600, 30);
        rl.setBounds(20, 240, 600, 30);
        al.setBounds(20, 280, 600, 30);

        Button mb = new Button("CLICK HERE FOR MY PERSONAL DETAILS");
        mb.setFont(new Font("Calibri", Font.BOLD, 14));
        mb.setBounds(210, 70, 320, 30);

        mb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fnl.setText("Full Name: Aishwarya Rao");
                mnl.setText("Father Name: Ranjit Mother Name: Vijetha Age: 19");
                inl.setText("Roll No: BNU35628 College Name: Jain Degree College");
                rl.setText("Nationality: Indian Contact No: 9999988888");
                al.setText("Address: 7th Cross, Indira Nagar, Bangalore");
            }
        });

        f.add(mb);
        f.add(l1);
        f.add(fnl);
        f.add(mnl);
        f.add(inl);
        f.add(rl);
        f.add(al);

        f.setSize(800, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
