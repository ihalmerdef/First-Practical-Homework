package ch12;

import java.util.*;

public class InputMismatchExceptionDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
  
        // Display the result
        System.out.println(
          "The number entered is " + number);
        
      } 
      catch (IndexOutOfBoundsException ex) {
        System.out.println("Try again. (" + 
          "Incorrect input: an integer is required)");
    }
      
      finally {
    	  System.out.println("This message will always be excueted ");
      }
    } 
  }
