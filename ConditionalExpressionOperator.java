/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalexpressionoperator;

/**
 *
 * @author dcm_010
 */
import javax.swing.JOptionPane;
public class ConditionalExpressionOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2;
        n1 = Integer.parseInt ( JOptionPane.showInputDialog( null, "Enter a number"));
        n2 = Integer.parseInt ( JOptionPane.showInputDialog( null, "Enter another number"));
        JOptionPane.showMessageDialog (null, "Minimum is: " + (n1 < n2 ? n1 : n2));
   
        if (n1 <= n2)
            JOptionPane.showMessageDialog(null, "Minimum is: " + n1);
        else if (n2 > n1)
            JOptionPane.showMessageDialog(null, "Minimum is: " +n2);
        
    }
    
}
