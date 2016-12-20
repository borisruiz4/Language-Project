/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language.interpreter;

import java.util.Scanner;

/**
 *
 */
public class LanguageInterpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            String c;
        do{
        
       Identifier aElement = new Identifier();
       
       Scanner input = new Scanner(System.in);    
       System.out.println("Enter anything");
       String aString = input.nextLine();
       aString.trim();
       aElement.setBody(aString);
       
 //FailSafe
       if (aString == ""){
           do{
           System.out.println("You've pressed enter, please try inserting a valid variable name: ");
           aString = input.nextLine();
           aElement.setBody(aString);
           }while(aString == "");
       }
        
       //Check if is integer
       if(aElement.isInteger()) {
           aElement.convertToInt();
           if(aElement.isSignedInteger())
           System.out.println("This is a signed Integer!"); 
           else
           System.out.println("This is an unsigned Integer!");  
       }
       //Check if is double
       else if(aElement.isDouble()) {
           aElement.convertToDouble();
           if(aElement.isSignedDouble())
           System.out.println("This is a signed Real Number!");   
           else 
           System.out.println("This is an unsigned Real Number!");   
       }
       //Check if is mathematical operator
       else if(aElement.isMathOperator()) {
          System.out.println("This is a mathematical operator!");
       if(aElement.MathOperatorType() == 1)
           System.out.println("This is addition");
       else if(aElement.MathOperatorType() == 2)
           System.out.println("This is substraction");
       else if(aElement.MathOperatorType() == 3)
           System.out.println("This is multiplication");
       else if(aElement.MathOperatorType() == 4)
           System.out.println("This is a division");
       }
           //Check if is assigner
       else if(aElement.isAssigner()) {
          System.out.println("This is the assigner operator!");
       }
          //Check if is operator
       else if(aElement.isOperator()) {
          System.out.println("This is an operator!");
       if(aElement.OperatorType() == 1)
           System.out.println("This is a logical OR operator");
       else if(aElement.OperatorType() == 2)
           System.out.println("This is a logical AND operator");
       else if(aElement.OperatorType() == 3)
           System.out.println("This is a logical NOT oprator");
       else if(aElement.OperatorType() == 4)
           System.out.println("This is a comparative EQUAL operator");
       else if(aElement.OperatorType() == 5)
           System.out.println("This is a comparative NOT EQUAL operator");
       else if(aElement.OperatorType() == 6)
           System.out.println("This is a comparative LESS THAN operator");
       else if(aElement.OperatorType() == 7)
           System.out.println("This is a comparative LESS EQUAL operator");
       else if(aElement.OperatorType() == 8)
           System.out.println("This is a comparative GREATER THAN operator");
       else if(aElement.OperatorType() == 9)
           System.out.println("This is a comparative GREATER EQUAL operator");
       }
       //Check if is variable
       else if(aElement.isVariable()) {
          System.out.println("This is a variable!");
       if(aElement.variableType() == 1)
           System.out.println("The variable type is Integer");
       else if(aElement.variableType() == 2)
           System.out.println("The variable type is Real Number");
       else if(aElement.variableType() == 3)
           System.out.println("The variable type is String");
       }
       else 
           System.out.println("This is an unkown token");
       
       
       
       
       
       
       //Final Verdict
        System.out.println("You've entered : " + aElement.getBody());
               
        System.out.println("");
        
        System.out.println("Would you like to try again (Y/N)");
        c = input.nextLine();
        }while(!(c.contains("N")|| c.contains("n")));
    }      
}