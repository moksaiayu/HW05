
public class p26 {
	public static void main(String[] args)
	{
		CarL car1;
		car1 = new CarL();
		
		car1.show();
		
		
	}

}


class CarL
{
	private int num;
	private double gas;


public CarL()
{
	num = 0;
	gas = 0.0;
	System.out.println("�Ͳ��F���l");
}
public void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
	
}

}
