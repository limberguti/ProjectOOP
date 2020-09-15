package ec.edu.espe.purchaseandsalesrecordgui.utils;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés López
 */
public class ValidationTest {

    public ValidationTest() {
    }

    /**
     * Test of validateEmail method, of class Validation.
     */
    @Test
    public void testValidateEmail1() {
        System.out.println("validateEmail");
        String email = "andresilopeza@gmail.com";
        Validation instance = new ValidationImpl();
        boolean expResult = true;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validateEmail method, of class Validation.
     */
    @Test
    public void testValidateEmail2() {
        System.out.println("validateEmail");
        String email = "andresilopezagmail.com";
        Validation instance = new ValidationImpl();
        boolean expResult = false;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidateEmail3() {
        System.out.println("validateEmail");
        String email = "emcastillo2@espe.edu.ec";
        Validation instance = new ValidationImpl();
        boolean expResult = true;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validateEmail method, of class Validation.
     */
    @Test
    public void testValidateEmail4() {
        System.out.println("validateEmail");
        String email = "emcastillo2@";
        Validation instance = new ValidationImpl();
        boolean expResult = false;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidateEmail5() {
        System.out.println("validateEmail");
        String email = "ailopez4@espe.edu.ec";
        Validation instance = new ValidationImpl();
        boolean expResult = true;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validateEmail method, of class Validation.
     */
    @Test
    public void testValidateEmail6() {
        System.out.println("validateEmail");
        String email = "@espe.edu.ec";
        Validation instance = new ValidationImpl();
        boolean expResult = false;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidateEmail7() {
        System.out.println("validateEmail");
        String email = "eli.almeida.ec@hotmail.com";
        Validation instance = new ValidationImpl();
        boolean expResult = true;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validateEmail method, of class Validation.
     */
    @Test
    public void testValidateEmail8() {
        System.out.println("validateEmail");
        String email = "eli.almeida.ec@hotmailcom";
        Validation instance = new ValidationImpl();
        boolean expResult = false;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidateEmail9() {
        System.out.println("validateEmail");
        String email = "stalin.lopez@gmail.com";
        Validation instance = new ValidationImpl();
        boolean expResult = true;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validateEmail method, of class Validation.
     */
    @Test
    public void testValidateEmail10() {
        System.out.println("validateEmail");
        String email = "eli.almeida.ec@hotmail,com";
        Validation instance = new ValidationImpl();
        boolean expResult = false;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    public class ValidationImpl extends Validation {

        public void emptyFields(ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCedula, JLabel jlbOnlyNumbersCellphone, JLabel jlbValidateEmail) {
        }

        public void emptyFields(ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCellphone) {
        }
    }

}
