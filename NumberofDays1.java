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
import java.util.Scanner;
public class NumberofDays1 {
    
    public static void main(String[] args){
        
        int monthNum, yearNum;
        String result;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a month number: \t");
        monthNum = Integer.parseInt(keyboard.nextLine());
        
        if (monthNum < 1 || monthNum > 12){
           result = "Invalid month number entered";
        }
        else
        {             
            if(monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12){
              result = "Number of days is 31";
            }
            else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11){
                result = "Number of days is 30";
            }
            else{
               System.out.print("Enter a year:\t\t");
               yearNum = Integer.parseInt(keyboard.nextLine());
               if ((yearNum % 4 == 0) && (yearNum % 100 != 0) || (yearNum % 400 == 0)){
                   result = "Number of days is 29"; 
               }
               else{
                   result = "Number of days is 28";
               }
            }         
        }
    
    System.out.print(result);
}
}
