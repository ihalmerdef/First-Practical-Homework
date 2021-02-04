class ChildClass extends ParentClass{
	ChildClass(){
	/* It is by default invokes the constructor of parent class
	 * You can use super() to call the constructor of the parent.
	 * It should be the first statement in the child class
	 */
	System.out.println("Constructor of Child");
	
   }
   public static void main(String args[]){
	//Creating the object of child class
	ChildClass cc=new ChildClass();
   }
}
