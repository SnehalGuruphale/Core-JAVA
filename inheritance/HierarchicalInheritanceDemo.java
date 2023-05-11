package inheritance;
class Parent123
{
   void show()
   {
	  System.out.println("parent class called...."); 
   }
}
class child1 extends Parent123
{
   	void m1()
   	{
  	  System.out.println("child1 class called...."); 
    }
}
class child2 extends Parent123
{
	void m2()
	{
	  System.out.println("parent class called...."); 
	}
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args){
		child1 c=new child1();
		c.show();
		c.m1();
		child2 c2=new child2();
		c2.show();
		c2.m2();
		
	}

}
