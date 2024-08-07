import java.awt.*;

public class _12B_MenuDemo {
    //        ^ remove this _12B_ before runninng from every where

    _12B_MenuDemo() {
        Frame fr = new Frame("Menu Demo");
        MenuBar mb = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");

        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(viewMenu);

        MenuItem a1 = new MenuItem("New");
        MenuItem a2 = new MenuItem("Open");
        MenuItem a3 = new MenuItem("Save");

        MenuItem b1 = new MenuItem("Copy");
        MenuItem b2 = new MenuItem("Find");

        MenuItem c1 = new MenuItem("Show");

        fileMenu.add(a1);
        fileMenu.add(a2);
        fileMenu.add(a3);

        editMenu.add(b1);
        editMenu.add(b2);

        viewMenu.add(c1);

        fr.setMenuBar(mb);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    public static void main(String args[]) {
        new _12B_MenuDemo();
    }
}
