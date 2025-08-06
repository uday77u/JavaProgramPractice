package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f = new File("\\F:\\u123u");
		f.createNewFile();
		/* if(f.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is already Created");
		} */
	}

}
