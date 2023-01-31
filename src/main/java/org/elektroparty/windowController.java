package org.elektroparty;

import javax.swing.*;
import java.awt.*;

public class windowController {

    private JFrame window;
    public windowController(int width, int height) {
        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Create the window
        window = new JFrame();
        window.setSize(width, height);
        window.setLocationRelativeTo(null); // center the window on the screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void setBackgroundColor(Color color) {
        window.setBackground(Color.BLUE);

    }
}
