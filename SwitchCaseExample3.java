import java.util.Scanner;

class SwitchCaseExample3
{
	public static void main(String args[])
	{
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		size = sc.nextInt();
		
		switch(size)
		{
			case 28:
				System.out.println("Small");
			break;
			
			case 32:
				System.out.println("Medium");
			break;
			
			case 40:
				System.out.println("Large");
			break;
			
			case 42:
				System.out.println("Extra Large");
			break;
			
			default:
				System.out.println("invalid size!!!");
		
		}
	}
}