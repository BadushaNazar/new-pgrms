package CaseStudy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.Iterator;
class Std{  	  
	    String name;
		String address;
		int contactno;
		String emailid;
	   Std(String name,String address,int contactno,String emailid){
	   this.name=name;
	   this. address= address;
	   this.contactno=contactno;
	   this.emailid=emailid;
	   }
	}
public class registration2 {
	public static void main(String args[]) throws IOException {
		String name;
		String address;
		int contactno;
		String emailid;
		String proof;
		String proofid;
		String a;
		String d;
		ArrayList<Std> al=new ArrayList<Std>();
		do
		{
		Scanner s=new Scanner(System.in);
		System.out.println("     REGISTRATION    ");
		System.out.print("Enter your name:");
		     name=s.next();
		System.out.print("Enter your address:");
		address=s.next();
		System.out.print("Enter your Contact Number:");
		    contactno=s.nextInt();
		System.out.print("Enter your E-Mail ID:");
		emailid=s.next();
		Std s1=new Std(name,address,contactno,emailid);
		al.add(s1);
		System.out.print("Do you want to Countinue:Y/N?");
		a=s.next();
		}
		while(a.equals("Y"));
		System.out.println("\t\tDETAILS ARE ");
		java.util.Iterator<Std> itr=al.iterator();
		while(itr.hasNext()){
		    Std st=(Std)itr.next();
		    System.out.println(st.name+" "+st.address+" "+st.contactno+" "+st.emailid);
		   }  		
}
}