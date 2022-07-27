package polymorphism;

public class Overloading
{
  public void squre(int a,int b)
  {
	  System.out.println(a+b);
  }
  
  public void squre(int a,int b,int c)
  {
	  System.out.println(a+b+c);
	  
  }
  
  public static void main(String args[])
  {
	  Overloading load=new Overloading();
      load.squre(2, 3);
	  load.squre(2, 3,4);
	
		
  }
}
