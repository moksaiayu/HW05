
public class p7 {
	public static void main(String[] args)
	{
		CarB car1;
		car1 = new CarB();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		CarB car2;
		car2 = new CarB();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車號是"+ car1.num);
		System.out.println("汽油量是"+ car1.gas);
		
		System.out.println("車號是"+ car2.num);
		System.out.println("汽油量是"+ car2.gas);
		
	}
}

class CarB
{
	int num;
	double gas;
	
}

