class Child extends Parent{//subclass
   Child(){
	System.out.println("Constructor of Child");
   }
   public void disp(){//method overriding 
	System.out.println("Child Method");
        //Calling the disp() method of parent class
	disp();
   }
   public static void main(String args[]){
	//Creating the object of child class
	   Child obj = new Child();
	   obj.disp();
   }
}
