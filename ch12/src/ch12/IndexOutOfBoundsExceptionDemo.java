package ch12;
import java.util.*;

public class IndexOutOfBoundsExceptionDemo {
	
	public static Scanner scanner;
	
	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5};
		scanner = new Scanner(System.in);
		System.out.print("Please enter arrey index");


		
	try{
		int x = scanner.nextInt();
		System.out.println("The value is " + ar[x]);

	}
	catch (IllegalArgumentException ex){
		System.out.println("Try again enter arrray index ");
	}
	finally {
  	  System.out.println("This message will always be excueted ");
    }
  }
}

