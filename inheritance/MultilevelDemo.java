package inheritance;
class GrandParent
{
  void show1()
  {
	  System.out.println("grandparent called...");
  }
}
class Parent12 extends GrandParent
{
  void show2()
  {
	  System.out.println("parent called.....");
  }
}
class Child12 extends Parent12
{
	void show3()
	{
		  System.out.println("child called.....");
    }
}
public class MultilevelDemo {

	public static void main(String[] args) {
		Child12 c=new Child12();
		c.show1();
		c.show2();
		c.show3();
   
	}

}
