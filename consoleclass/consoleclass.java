package consoleclass;

import java.io.Console;
public class consoleclass 
{
	public static void main(String[] args) 
	{
		String str;
		Console con=System.console();    //creating console object
		if(con ==null)
		{
			System.out.println("No console avilable");
			return;
		}
		str=con.readLine(" enter name");
		System.out.println(str);
		System.out.println(" enter password");
		char ch[]=con.readPassword();
		String pa=String.copyValueOf(ch);    //converting char array into string   
		System.out.println("password is :"+pa);
	}
}