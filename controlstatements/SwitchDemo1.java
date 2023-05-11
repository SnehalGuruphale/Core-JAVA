package controlstatements;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice: ");
        int ch=sc.nextInt();
        System.out.println("enter your marks: ");
        int marks=sc.nextInt();
        switch(ch)
        {
        case 1:
        	if(marks>0 && marks<35)
        	{
        		System.out.println("you are fail");
        	}
        	break;
        case 2:
        	if(marks>35 && marks<60)
        	{
        		System.out.println("you are pass with grade C");
        	}
        	break;
        case 3:
        	if(marks>60 && marks<80)
        	{
        		System.out.println("you are pass with grade B");
        	}
        	break;
        case 4:
        	if(marks>80 && marks<100)
        	{
        		System.out.println("congratulations you are pass with grade A++");
        	}
        	break;
        	default:
        		System.out.println("invalid input");
        		
        }
	}

}
