package CaseStudy;
import java.util.LinkedList;
import java.util.Scanner;
public class registration {
	private
	 String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 public registration(String name,String address,String contactNumber,String email,String proofType, String proofID)
	 {
	   this.name=name;
	   this.address=address;
	   this.contactNumber=contactNumber;
	   this.email=email;
	   this.proofType=proofType;
	   this.proofID=proofID;
	 }
	 void Register()
	{
		int count=0;
	    System.out.println("Thank you for registering.your id is "+ ++count+"..");
	}
	public static void main(String args[])
	{
		registration  obj=new registration("Vishnu", "kkk" , "123456789" , "llllll" , "bbbbbb" , "tttttt");
		LinkedList<registration> ob=new LinkedList<registration>();
		registration ob1=new registration("Kiran", "jjjjjj" , "987654321" , "sssssss" , "dddddd" , "aaaaaa");
		registration ob2=new registration("Badusha" , "fffff" , "08796543" ,"mmmmmm","gggggg","uuuuuuu");
		ob.add(obj);
		ob.add(ob1);
		ob.add(ob2);
		for(registration l:ob)
		{
			System.out.println(l.name+" "+l.address+" "+l.contactNumber+" "+l.email+" "+l.proofType+" "+" "+l.proofID);
		}
	}	
}