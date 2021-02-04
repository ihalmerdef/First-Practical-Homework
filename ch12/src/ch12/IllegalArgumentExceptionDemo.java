package ch12;
public class IllegalArgumentExceptionDemo {
 
   public static void main(String[] args) {
 
      method(-1);
   }

	
 
   public static void method(int x){
	   
	   		try{
	   			if (x > 0) {
	   		
	   	     System.out.println("True");
	   		}
	   		else {
    	         throw new IllegalArgumentException("must be positive");
    	  }
   }
   catch(IllegalArgumentException e) {
 	     System.out.println("X must be positive");

   }
	   	
	
}
}

