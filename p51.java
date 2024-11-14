public class p51
{
	public static void main(String[] args)
	{
		p51Car[] car1 = new p51Car[3];
		
		for(int i = 0; i < car1.length; i++)
			car1[i] = new p51Car();
		
		car1[0].setCar(1234, 20.5);
		car1[1].setCar(2345, 30.5);
		car1[2].setCar(3456, 40.5);
		
		for(int i = 0; i < car1.length; i++)
			car1[i].show();
	}

}
class p51Car
{
	private int num;
	private double gas;
	
	public p51Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("設車號為"+ num +"，汽油量為"+ gas);
	}
	
	public void show()
	{
		System.out.print("車號是:"+this.num);
		System.out.println(" 汽油量是:"+this.gas);
	}
}