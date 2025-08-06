package File_Handling;

import java.io.File;

public class OperationsOnFolder {

	public static void main(String[] args) throws InterruptedException {
		File f = new File("\\F:\\u123");
		if(f.mkdirs())
		{
			System.out.println("Folder is Created");
			Thread.sleep(4000);
		}
		else
		{
			System.out.println("Folder is already Created");
		}

		if(f.exists())
		{
			System.out.println("Folder is present");
			Thread.sleep(4000);
		}
		else
		{
			System.out.println("Folder is not present");
		}
		if(f.delete())
		{
			System.out.println("Folder is deleted");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Folder is not Deleted");
		}
	}

}

