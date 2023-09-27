public class vehicle
{
	String company;
	String model;
	int number;
	
	public vehicle()
	{
		this("suzuki");
	}
	
	public vehicle(String company)
	{
		this(company, "vagnor");
	}
	
	public vehicle(String company, String model)
	{
		this(company, model, 3308);
	}
 	
	public vehicle(String company, String model, int number)
	{
		this.company= company;
		this.model=model;
		this.number=number;
	}
}