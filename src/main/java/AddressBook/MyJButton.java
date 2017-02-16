package AddressBook;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by stephanernst on 1/26/2017.
 */

public class MyJButton extends JButton {
    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }
}
