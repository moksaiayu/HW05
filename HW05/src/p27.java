
public class p27 {
	public static void main(String[] args)
	{
		CarM car1;
		car1 = new CarM();
		car1.show();
		
		CarM car2;
		car2 = new CarM(1234,25.0);
		car2.show();
		
	}

}


class CarM
{
	private int num;
	private double gas;
	

public CarM()
{
	num = 0;
	gas = 0.0;
	System.out.println("生產了車子");
}
public CarM(int n, double g)
{
	num = n;
	gas = g;
	System.out.println("生產了車號為"+num+ "，汽車量為"+gas+"的車子");
}
public void show()
{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
}

}
