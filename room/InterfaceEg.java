package room;
interface it1
{
	void method1();
	void method2();
	void method3();
}
 class InterfaceEg implements it1 {
	
		public void method1()
		{
			System.out.println("method1");
		}
		public void method2()
		{
			System.out.println("method2");
		}
		public void method3()
		{
			System.out.println("method3");
		}
	

	public static void main(String[] args) {
		it1 t=new InterfaceEg();
		t.method1();
		t.method2();
		t.method3();
		
		
	}
 }
