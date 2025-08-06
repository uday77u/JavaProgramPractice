package methods;

public class NonStaticMethodReturnType {

		int sumR()
		{
			int a=5,b=8,sum=a+b;
			return sum;
		}
		public static void main(String[] args) {
			NonStaticMethodReturnType m = new NonStaticMethodReturnType(); 
			System.out.println(m.sumR());
		}

	}
