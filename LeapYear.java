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
public class LeapYear 
{
    
    public static void main(String[] args){
        
       int yearInput;
       String result;
       yearInput = Integer.parseInt (JOptionPane.showInputDialog(null, "Enter year"));
       if (((yearInput % 4 == 0) && (yearInput % 100 !=0)) || (yearInput % 400 == 0))
           result = "Year input is a leap year";
       
       else
           result = "Year input is not a leap year";
       JOptionPane.showMessageDialog(null, result, "output", 1);
    }
}
