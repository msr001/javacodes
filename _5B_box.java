import java.applet.*;
import java.awt.*;

public class _5B_box extends Applet {
    //        ^ remove this _5B_ before runninng from every where
    public void paint (Graphics g){
        int row,colum,x,y=20;

        for(row = 1; row<5;row++){
            x=20;
            for(colum = 1; colum<5;colum++){
                g.drawRect(x,y,40,40);
                x= x+20;
            }
            y = y+20;
        }
    }
    
}






// make new html file using .html tage
// <html>
// <applet code = "box.class" height = 500 width = 500></applet>
// </html>
// run appletviewer (html file name).java 
// appletviewer (html file name).html
//appletviewer test.java or test.html

