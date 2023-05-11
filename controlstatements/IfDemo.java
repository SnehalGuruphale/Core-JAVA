package controlstatements;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your age: ");
		int age=sc.nextInt();
		
		//using curly brace
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		//without curly brace
		if(age<18)
			System.out.println("not eligible");
}
}
