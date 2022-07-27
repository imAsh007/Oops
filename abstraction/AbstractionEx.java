package abstraction;

public abstract class AbstractionEx
{
  public abstract void demo();

  public static void add(int a,int b,int c)
  {
	  System.out.println(a+b+c);
  }
  public static void multiply(int a,int b, int c)
  {
	  System.out.println(a*b*c);
  }
}
 class Subclass
{
	public static void demo()
	{
		System.out.println("abstract method called");
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b-c);
	}
	public static void multiply(int a,int b,int c)
	{
		System.out.println(a*b+c);
	}
	public static void main(String[] args) 
	{	
	   Subclass.demo();
	  Subclass.add(1,2,3);
	   Subclass.multiply(3, 4, 5);
	}
}
