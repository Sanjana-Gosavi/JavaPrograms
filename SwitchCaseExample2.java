import java.util.Scanner;

class SwitchCaseExample2
{
	public static void main(String args[])
	{
		int a;
		int b;
		//int c = 10;
		String choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Arithmetic Operations!!!");
		
		
		System.out.println("Enter your choice:");
		System.out.println("1. addition 2. subtraction 3. multiplication 4. division 5. modulo");
		choice = sc.nextLine();
		
		System.out.println("Enter the two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
	
		
		
		
		
		switch(choice)
		{
			case "addition":
				int add = a + b;
				System.out.println("Addition of two numbers is:" +add);
			break;
			
			case "subtraction":
				int sub = a - b;
				System.out.println("Subtraction of two numbers is:" +sub);
			break;
			
			case "multiplication":
				int mul = a * b;
				System.out.println("multiplication of two numbers is:" +mul);
			break;
			
			case "division":
				int div = a / b;
				System.out.println("Division of two numbers is:" +div);
			break;
			
			case "modulo":
				int mod = a % b;
				System.out.println("Using modulo division is:" +mod);
			break;
			
			
			default:
			System.out.println("invalid choice!!!");
		}
		
	}
}