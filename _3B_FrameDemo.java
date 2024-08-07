import java.awt.*;
public class _3B_FrameDemo {
    //        ^ remove this _3B_ before runninng from every where
    _3B_FrameDemo(){

        Frame fm = new Frame();
        fm.setTitle("My first Frame");
        Label lb = new Label("wellcome to gui ");
        fm.add(lb);
        fm.setSize(300,300);
        fm.setVisible(true);
    }
    public static void main (String []args){
        
        _3B_FrameDemo ta = new _3B_FrameDemo();
    }
    
}
