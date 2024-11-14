public class p26
{
	public static void main(String[] args)
	{
		p26Car car1 = new p26Car();

		car1.show();
	}

}
class p26Car
{
	private int num;
	private double gas;
	
	public p26Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}