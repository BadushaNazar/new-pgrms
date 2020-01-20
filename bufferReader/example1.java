package bufferReader;

import java.io.Console;  
public class example1
{    
	public static void main(String args[])
	{    
		        Console c=System.console();    
				System.out.println("Enter password: "); 
				    
				char cha [] =c.readPassword(); 
				    
				String pass=String.valueOf(cha);//converting char array into string    
				System.out.println("Password is: "+pass);    
	}    
}  
