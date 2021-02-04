package ch12;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
		File myobject= new File("OOPfile.txt");
		if (myobject.createNewFile()) {
			System.out.println("File Created Successfully "+ myobject.getName());
		}else {
			System.out.println("File Already existed");
		}
		
	}
		catch(IOException e) {
			System.out.println("An error ocuured");
			e.printStackTrace();
		}
			
		}

}

