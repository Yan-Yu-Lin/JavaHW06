public class p9
{

	public static void main(String[] args)
	{
		p9Car car1 = new p9Car();
		car1.num = 1234;
		car1.gas = 20.5;
	}

}
class p9Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}