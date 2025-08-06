package Java_adv_exceptions;
class SampleG
{
	public void finalize()
	{
		System.out.println("Garbage collected");
	}
	
}

public class Garbage_collection {

	public static void main(String[] args) {
		SampleG s1 = new SampleG();
		SampleG s2 = new SampleG();
		SampleG s3 = new SampleG();
		s1=null;
		s2=null;
		s3=null;
		System.gc();
	}

}
