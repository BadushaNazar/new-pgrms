package objclass;

public class Obcl {
static int last_roll=100;
int roll_no;
//constructor
Obcl()
{
	roll_no=last_roll;
	last_roll++;
	}
public int hashCode()
{
	return roll_no;
}
public static void main(String args[])
{
Obcl s=new Obcl();
System.out.println(s);
System.out.println(s.toString());
Object obj=new String("FACE");
@SuppressWarnings("rawtypes")
Class c=obj.getClass();
System.out.println("Class of object is:"+c.getName());
s=null;
System.gc();
}
protected void finalize()
{
	System.out.println("Finilized mathod called");	
}
}
