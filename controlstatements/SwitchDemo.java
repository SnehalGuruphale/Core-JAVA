package controlstatements;

public class SwitchDemo {

	public static void main(String[] args) {
		int x=10;
		switch(x+1)
		{
		case 10:
			System.out.println("print 10");
			break;
		case 11:
			System.out.println("print 11");
			break;
			default:
				System.out.println("invalid");
		}

	}

}
