package ec.edu.espe.purchaseandsalesrecordgui.utils;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Andrés López
 */
public class Validation {

    public boolean validateEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public void validateOnlyNumbers(java.awt.event.KeyEvent evt, JTextField txt, JLabel jlb) {
        char character = evt.getKeyChar();

        if (Character.isLetter(character)) {
            txt.setEditable(false);
            jlb.setText("Only Numbers!");
        } else {
            txt.setEditable(true);
        }
    }

    public void emptyFields(java.awt.event.ActionEvent evt, JPanel pnl) {
        JTextField box;
        for (int i = 0; i < pnl.getComponentCount(); i++) {
            if (pnl.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                box = (JTextField) pnl.getComponent(i);
                box.setText("");
            }
        }
    }

}
