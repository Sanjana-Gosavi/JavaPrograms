class SubjectMarks
{
	public static void main(String args[])
	{
		int s1 = 40;
		int s2 = 92;
		int s3 = 70;
		int s4 = 47;
		int s5 = 45;
	
		int total;
		float avg;
	
		total = s1 + s2 + s3 + s4 + s5;
		System.out.println("Total of 5 subjects is:" +total);
		
		avg = total / 5;
		System.out.println("Average is:" +avg);
	}
}