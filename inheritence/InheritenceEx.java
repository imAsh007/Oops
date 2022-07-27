package inheritence;

  class A 
{
   public static void show()
   {
	   System.out.println("show method called");
   }
}
class B extends A
{
   public static void print()
   {
	   System.out.println("print method called");
   }
}
 public class InheritenceEx extends B
{
	public static void display()
	{
		System.out.println("display");
	}
  public static void main(String args[])
  {
	  InheritenceEx ob=new InheritenceEx();	  
	  ob.show();
	  ob.print();
	  ob.display();
	
	  
  }
}
