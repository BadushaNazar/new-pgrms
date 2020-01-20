package multithreading;
class Numbers implements Runnable
{
	public void run()
	{
		for(int i =0; i < 4; i++)
			System.out.println(i);
	}
}
public class example2
{

	public static void main(String[] args)
	{
	  Runnable obj1 = new Numbers(); //can be reference of Runnable interface
	  Numbers obj2 = new Numbers();
	  Thread thread1 = new Thread(obj1); //invokes thread class constructor
	  Thread thread2 = new Thread(obj2);
	  //Multithreading
	  thread1.start();
	  thread2.start();
	}

}
