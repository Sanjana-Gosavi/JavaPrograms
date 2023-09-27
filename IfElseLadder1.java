class IfElseLadder1
{
	public static void main(String args[])
	{
		int marks=55;
		
		if(marks < 40)
		{
			System.out.println("FAIL!!!");
		}
		else if((marks >= 40 ) && (marks <= 60))
		{
			System.out.println("Second class!!");
		}
		else if((marks >= 61) && (marks <= 75))
		{
			System.out.println("First class!!");
		}
		else if((marks >= 76) && (marks <= 100))
		{
			System.out.println("Distinction!!!");
		}
		else
		{
			System.out.println("Invalid marks!!");
		}
	}
}