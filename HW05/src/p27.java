
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
	System.out.println("�Ͳ��F���l");
}
public CarM(int n, double g)
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
