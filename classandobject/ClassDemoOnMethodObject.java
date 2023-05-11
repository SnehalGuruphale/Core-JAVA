package classandobject;
class First
{ 
	int a1=3;
	void display1()
	{
		System.out.println(a1);
	}
	//First f=new First();//can create object anaywhere
	
}
public class ClassDemoOnMethodObject {

	int a=4;
	void display()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      First f=new First();
      f.display1();
      ClassDemoOnMethodObject obj=new ClassDemoOnMethodObject();
      obj.display();
	}

}
