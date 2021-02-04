public class TestPerson {
public static void main(String[] args) {
// TODO Auto-generated method stub
Person student=new
Person("Ali",123456789,055555555,20,"Computer Science and Information Systems College",
"IS","Student");
Person professor=new
Person("Mohammed",987654321,056666666,50,"Computer Science and Information Systems College",
"IS","Professor");
System.out.println("The name of the person is: "+student.getName());
System.out.println("The ID of the person is: "+student.personID());
System.out.println("--------------------");
System.out.println("The name of the person is: "+professor.getName());
System.out.println("The position of the person is: "+professor.position);

}
}