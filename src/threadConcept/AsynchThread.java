package threadConcept;

	class Sample extends Thread
	{
		public void run() 
		{

			for(int i=1;i<=10;i++)
			{
					try {
						System.out.println(i);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						//e.printStackTrace();
					}
				
			}
		}
	}

	class Demo extends Thread
	{
		public void run()
		{
			for(int i=11;i<=20;i++)
			{
				
					System.out.println(i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					//	e.printStackTrace();
					}
			
		}
		}
	}

	public class AsynchThread {

		public static void main(String[] args) {
			Sample s=new Sample();
			Thread a1 = new Thread(s);
			a1.start();
			
			Demo d=new Demo();
			Thread a2 = new Thread(d);
			a2.start();

		}
	}



