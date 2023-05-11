package controlstatements;

import java.util.Scanner;

public class DoWhileDemo1 {

	Scanner sc=new Scanner(System.in);
	
	int completedModules;
	int totalModules;
	int ch;
	static String name;
	int password=1234;
	static int password1;
	
	void login()
	{
		
		System.out.println("enter name: ");
		name=sc.next();
		System.out.println("enter password: ");
		password1=sc.nextInt();
		if(password1==password)
		{
			System.out.println("successfully logged in............");
		}
		else
		{
			System.out.println("invalid password");
		}
		
	}
	void noOfSubjects()
	{
		System.out.println("no of subjects for cdac are: ");
		
	}
	
	void select()    //nonstatic method
	{
		do
		{
			System.out.println();
			System.out.println("**WELCOME TO CDAC BOOKLET**");
			System.out.println("------------------------------------");
			System.out.println("please choose option of which you want information abount: ");
			System.out.println("1.total no of subjects");
			System.out.println("2.total no of marks");
			System.out.println("3.total no of time");
			System.out.println("4.about exams");
			System.out.println("5.exit");
			
		    System.out.println("------------------------------------");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("info about total number of subjects are as follows: ");
				System.out.println("1.Concept of programming");
				System.out.println("2.operating system");
				System.out.println("3.Core java");
				System.out.println("4.Advanced java");
				System.out.println("---------------");
				System.out.println("plsease press enter to go back on main menu ");
				System.out.println();
		       break;
			case 2:
				System.out.println("total no of marks: ");
				System.out.println("internal marks for each subject=20");
				System.out.println("exam marks=40");
				System.out.println("practical marks=40");
				break;
			case 3:
				System.out.println("total no of time: ");
				System.out.println("6 months");
				break;
			case 4:
				System.out.println("about exams: ");
				System.out.println("1.module wise exam");
				System.out.println("2.final ceee exam");
				break;
			case 5:
				System.exit(0);
				default:
					System.out.println("please provide valid input: ");
				
			}
			
		}while(true);
	}
   static void display()  //static method
   {
	   System.out.println("thank u");
   }
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		DoWhileDemo1 d=new DoWhileDemo1();
		d.select();
		display();
   }
}
