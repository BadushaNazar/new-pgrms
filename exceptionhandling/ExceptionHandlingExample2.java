package exceptionhandling;
class Test extends Exception{}

public class ExceptionHandlingExample2
{

	public static void main(String[] args) 
	{
		try
		{
			throw new Test();
		}
		catch(Test t)
		{
			System.out.println("Got the Test Exception");
		}
		finally
		{
			System.out.println("Inside finally block ");
		}
		
	}

}