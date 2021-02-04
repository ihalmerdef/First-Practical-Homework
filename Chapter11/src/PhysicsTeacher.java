
public class PhysicsTeacher extends Teacher{//Inheritance are used here using extends 
   String mainSubject = "Physics";
   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();
	System.out.println(obj.collegeName); //Physics College
	System.out.println(obj.job);//Teacher
	System.out.println(obj.mainSubject);//Physics
	obj.jobDescription();//Teaching
   }
}
