package encapsulation;

public class EncapsulationEx 
{
      private long id;
      private String name,company,address;
      
      public void setId(int id)
      {
    	  this.id=id;
      }
      public long getId()
      {
    	  return id;
      }
      
      public void setName(String name)
      {
    	  this.name=name;
      }
      public String getName()
      {
    	  return name;
      }
	@Override
	public String toString() {
		return "EncapsulationEx [id=" + id + ", name=" + name + ", company=" + company + ", address=" + address + "]";
	}

 class B
 {
	     public static void main(String args[])
	     {
	    	 EncapsulationEx en=new EncapsulationEx();
	    	 en.setId(101);
	    	 System.out.println(en.getId());
	     }
}
}    


