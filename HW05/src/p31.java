
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
	System.out.println("�Ͳ��F���l");
}

public void setCar(int n, double g)
{
	num = n;
	gas = g;
	System.out.println("�Ͳ��F������"+num+ "�A�T���q��"+gas+"�����l");
}

public static void showSum()
{
	System.out.println("���l�`�@��"+sum+"�x");
}

public void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
}

}
