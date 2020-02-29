package javaapplication45;

import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
    public myJFrame()
    {
        super("My First Frame");
        myJPanel mjp = new myJPanel();
        add(mjp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (800, 480);
        setVisible(true);
    }
}
