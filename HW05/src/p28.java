
public class p28 {
	public static void main(String[] args)
	{
	
		
		CarN car1;
		car1 = new CarN();
		car1.show();
	
		
		CarN car2;
		car2 = new CarN(1234, 25.0);
		car2.show();
	}
}

class CarN
{
	private int num;
	private double gas;
	

public CarN()
{
	num = 0;
	gas = 0.0;
	System.out.println("生產了車子");
}

public CarN(int n, double g)
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
