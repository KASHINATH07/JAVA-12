class Employee 
{
	String name;
	int age;
	public Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
class Doctor extends Employee
{
		double salary;
		String specialist;
		public Doctor(String name,int age,double salary,String specialist)
		{
			super(name,age);
			this.salary=salary;
			this.specialist=specialist;
		}
		public void displayDoctor()
		{
			display();
			System.out.println(salary);
			System.out.println(specialist);
		}
	
}
class MainClass
{

	public static void main(String[] args) 
	{
		Doctor d1=new Doctor("Psycho Mari",50,250000,"Psycho Artist");
		((Employee) d1).displayDoctor();
	

	}
}
