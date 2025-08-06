package Java_advance;

class Whats_app_v1
{
	void status()
	{
		System.out.println("upload the photo");
	}
}

class Whats_app_v2 extends Whats_app_v1
{
	void status()
	{
		System.out.println("upload the photo,link,image,video");
		super.status(); 
	}	
}

public class Method_overriding {
	public static void main(String[] args) 
	{
		System.out.println("--------Method Overriding-------");
		Whats_app_v2 v2=new Whats_app_v2();
		v2.status();
	}

}
