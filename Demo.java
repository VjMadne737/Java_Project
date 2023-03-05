class Demo
{
	public Demo()
	{
		System.out.println("zero arg");
	}
	public Demo(int a)
	{
		System.out.println("one with int arg");
	}
	public Demo(double b)
	{
		System.out.println("one with double arg");
	}
	public Demo(int a, double b)
	{
		System.out.println("two arg");
	}
	public Demo(double b, int a)
	{
		System.out.println("Order changed arg");
	}
	public static void main(String[] args) {
		new Demo();
		new Demo(10);
		new Demo(10.0);
		new Demo(10, 10.0);
		new Demo(10.0,10);
	}
}