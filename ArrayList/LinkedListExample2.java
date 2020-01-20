package ArrayList;
import java.util.*;
public class LinkedListExample2 {

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		ArrayList<String> Al=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		String ele=s.next();
		ll.add(ele);
	}
		int m=s.nextInt();
		for(int i=0;i<m;i++)
		{
			String ele=s.next();
			Al.add(ele);
		}
		ll.addAll(Al);
		System.out.println(ll);
		
		
	}

}
