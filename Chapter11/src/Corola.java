public class Corola extends Camry{

   public Corola()
   {
	System.out.println("Corola Model: 2020");
   }
   public void speed()
   {
	System.out.println("Max: 220Kmph");
   }
   public static void main(String args[])
   {
	 Corola obj=new Corola();
	 //Class Car
	 //Class Camry
	 //Corola Model: 2020
	 obj.vehicleType();//Vehicle Type: Car
	 obj.brand();//Brand: Toyota
	 obj.speed();//Max: 220Kmph
   }
}