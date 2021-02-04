class Camry extends Car{
   public Camry()
   {
	System.out.println("Class Camry");
   }
   public void brand()
   {
	System.out.println("Brand: Toyota");
   }
   public void speed()
   {
	System.out.println("Max: 300Kmph");
   }
   public static void main(String args[])
   {
	 Camry obj=new Camry();
	 //Class Car
	 //Class Camry
	 obj.vehicleType();//Vehicle Type: Car
	 obj.brand();//Brand: Toyota
	 obj.speed();//Max: 300Kmph
   }
}
