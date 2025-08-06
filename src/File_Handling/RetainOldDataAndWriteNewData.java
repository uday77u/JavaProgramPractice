package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RetainOldDataAndWriteNewData {

	public static void main(String[] args) throws IOException {
		File f = new File("\\F:\\u123u.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("Practice the Programs\n");
		fw.write("Revise the concept\n");
		fw.flush();
		System.out.println("Data is written");
	}

}
