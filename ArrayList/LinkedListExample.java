package ArrayList;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
        ll.add("Competition");
        ll.add("Be Positive");
        ll.add("Happy day");
        //traversing using for
        for(String b:ll)
        {
            System.out.println(b);
        }
        //traversing using iterator
        Iterator itr=ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
	}
}
