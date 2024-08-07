//4 applet


import java.awt.*;
public class _4B_drawshape extends Canvas {
    //        ^ remove this _4B_ before runninng from every where
    public void paint (Graphics g){
        g.drawRect(50,75,100,50);
        g.fillRect(200,75,50,50);
        g.drawOval(50,275,100,50);
        g.fillOval(150, 275, 100, 50);
    }
    public static void main(String[] args) {
        _4B_drawshape dr = new _4B_drawshape();
        Frame fm = new Frame();
        fm.setTitle("Shapes ");
        fm.add(dr);
        fm.setSize(300,500);
        fm.setVisible(true);

        
    }
    
}
