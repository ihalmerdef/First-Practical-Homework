import java.util.Scanner;

public class CheckDept{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter your departmet name:");
		String deptName =input.nextLine();
		System.out.println("According to checkDepartment Method, this is a :");
		
		
		String answer=checkDepartment(deptName);
		System.out.println(answer);
		
		
	}
	public static String checkDepartment(String y) { 
		
		if(y.equals("CS")) {
			System.out.println("CS Student");
		}
		else {
			System.out.println("IS Student");

		}
		return y;
	}
}

