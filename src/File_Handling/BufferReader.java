package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		File f= new File("\\F:\\u123u.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
	}

}
