package polymorphism;

public class Overriding 
{
     public void print(int a,int b)
     {
         System.out.println(a+b);
     }
     
}
class B extends Overriding
{
      public void print(int a,int b)
      {
    	  System.out.println(a*b);
      }
      
     public static void main(String[] args) 
     {	
        B ob=new B();
        ob.print(2, 4);  
	 }
}
 
