package AddressBook;

import javax.swing.*;
import java.awt.*;

/**
 * Created by stephanernst on 1/26/2017.
 */
public class MyJFrame extends JFrame {
    public void init() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setSize(new Dimension(300, 300));
                setVisible(true);
            }
        });
    }
}
