class Test
{
	int a;
	public Test(int a)
	{
		this.a=a;
	}
	public void display()
	{
		System.out.println(a);
	}
}
class Sample extends Test
{
	int b;
	public Sample(int a,int b)
	{
		super(a);
		this.b=b;
	}
	public void display()
	{
		super.display();
		System.out.println(b);
	}
}

class  MainClass1
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample(10,20);
		Test t1=(Test)  s1;
		t1.display();
	}
}
