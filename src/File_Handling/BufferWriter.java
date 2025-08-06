package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class BufferWriter {

	public static void main(String[] args) throws IOException {
		File f= new File("\\F:\\u123u.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Practice the Programs\n");
		bw.newLine();
		bw.write("Revise the concept\n");
		bw.newLine();
		bw.flush();
		System.out.println("Data is written");
	}

}
