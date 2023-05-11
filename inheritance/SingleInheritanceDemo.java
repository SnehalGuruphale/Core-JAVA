package inheritance;
class Parent
{
  public void m1()
  {
	  System.out.println("m1 method");
  }
}
class Child extends Parent
{
  public void m2()
  {
	  System.out.println("m2 called");
  }
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c=new Child();
       c.m1();
       c.m2();
	}

}
