
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
	System.out.println("�Ͳ��F���l");
}

public CarN(int n, double g)
{
	num = n;
	gas = g;
	System.out.println("�Ͳ��F������"+num+ "�A�T���q��"+gas+"�����l");
}

public void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
}

}