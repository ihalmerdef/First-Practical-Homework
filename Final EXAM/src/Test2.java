class Test2 extends Test { //inherit the house class
  private String room = "Kitchen";
       public void roomColor() {  
      System.out.println("Green");
      super.roomColor();

  }


   public static void main(String[] args){

    Test2 obj = new Test2();

    
    obj.roomColor();// Call the roomColor() method (from the House class) 

    }
    }
