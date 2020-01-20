package abs;

import java.util.Scanner;
public class mainops {
	private static Scanner s;

	public static void main(String arg[])
	{
		s = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		ops op=new ops();
		
		op.add(a,b);
		op.sub(a,b);
		op.mul(a,b);
		op.div(a,b);
		
		
	}
}
