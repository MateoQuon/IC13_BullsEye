import javax.swing.*;
import java.awt.*;

public class Main extends JPanel { // Main is the JPanel

    @Override
    public void paint(Graphics canvas){
        for (int i = 7; i > 0; i--) {
            if (i % 2 != 0)
                canvas.setColor(Color.RED);
            else
                canvas.setColor(Color.WHITE);
            canvas.fillOval((480/2)-(50*i)/2, (480/2)-(50*i)/2, 50*i, 50*i);
        }

    }

    public static void main(String[] args) {
        // Instantiate a new JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Bullseye!");
        frame.setSize(480, 480);
        // Add the JPanel to the JFrame
        frame.add(new Main());
        // By default, frames are invis
        frame.setVisible(true);
    }
}
/*
~~Notes~~
Swing: has 2 main containers
a) JFrame (outer window)
    -title
    -size (in pixels)
        *400x400 coords- top left:(0,0) ; bottom right: (399, 399)
b) JPanel (inner content)
    -shapes, drawing, filling
        *draw: outline
        *fill: color

 */
