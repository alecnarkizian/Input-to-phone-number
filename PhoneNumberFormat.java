//Program public PhoneNumberFormat class, Lab 8
//Written by Alec Narkizian
//created on 7.1,2017
//asks the user to enter a phone number
//converts the phone number into proper format
import java.util.Scanner;
import java.math.BigInteger;
public class PhoneNumberFormat{
   public void phoneNum(){
         int whileLoop = 1;
     while (whileLoop < 2)
     {
       Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter a 10 digit number. Type 999 to end.");
        //gets the user to enter the phone number they want
        String number3 = userInput.next();
        StringBuilder number = new StringBuilder();
        number.append(number3);
        //an if condition to verify that 10 digits were entered, before its formatted   
         if (number.length() == 10)
         {
            number.insert(0, "(");
            number.insert(4, ")");
            number.insert(5, " ");
            number.insert(9, "-");
            System.out.println(number);
            }
            //checks if the user entered 999 to end the code
         else if (number3.equals("999"))
         {
            whileLoop += 1;
            System.out.println("The End");
            }
            //if the input is bad
          else
            System.out.println("invalid input");

      }
      
            }
     }