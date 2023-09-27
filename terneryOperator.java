class terneryOperator
{
	public static void main(String args[])
	{
		int a=1;
		int b=27;
		int marks=30;
		
		String res	= (a % 2 == 0)? "Even Number" : "Odd number";
		System.out.println(res);
		
		int num = (a > b) ? a : b;
		System.out.println("Largest number is:"+num);
		
		int num1 = (a < b) ? a : b;
		System.out.println("Smallest number is:"+num1);
		
		String result = (marks >= 40) ? "Pass!!" : "Fail!!";
		System.out.println(result);
		
		String result2 = (b >= 0) ? "Positive number!!" : "Negative number!!";
		System.out.println(result2);
	}
}