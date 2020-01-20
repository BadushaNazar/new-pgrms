package room;

public class regChildClass extends registration3{
	public void add()
	{
		int a=10,b=20,c=0;
		c=a+b+10;
		System.out.println(c);
	}

	public static void main(String[] args) {
		registration3 obj=new regChildClass();
		obj.add();
		}

}
