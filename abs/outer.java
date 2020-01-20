package abs;
public class outer{

	private int n=30;
	class inner{
		void m1()
		{
			System.out.println("value :"+n);
			
		}
		
	}
	public static void main(String[] args) {
		outer obj1=new outer();
		outer.inner obj = new outer().new inner();
		
		obj.m1();

	}

}
