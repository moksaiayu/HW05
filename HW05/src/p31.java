
public class p31 {
	public static void main(String[] args)
	{
		CarO.showSum();
		
		CarO car1;
		car1 = new CarO();
		car1.setCar(1234,20.5);
		
		CarO.showSum();
		
		CarO car2;
		car2 = new CarO();
		car2.setCar(4567,30.5);
	}
}

class CarO
{
	public static int sum = 0;
	private int num;
	private double gas;
	

public CarO()
{
	num = 0;
	gas = 0.0;
	sum++;
	System.out.println("生產了車子");
}

public void setCar(int n, double g)
{
	num = n;
	gas = g;
	System.out.println("生產了車號為"+num+ "，汽車量為"+gas+"的車子");
}

public static void showSum()
{
	System.out.println("車子總共有"+sum+"台");
}

public void show()
{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
}

}
