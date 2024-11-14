public class p28
{
	public static void main(String[] args)
	{
		p28Car car1 = new p28Car();
		car1.show();
		p28Car car2 = new p28Car(1234, 25.0);
		car2.show();
	}

}
class p28Car
{
	private int num;
	private double gas;
	
	public p28Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public p28Car(int n, double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num +"，汽油量為"+ gas +"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}