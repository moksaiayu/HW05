
public class p11 {

	public static void main(String[] args)
	{
		CarD car1;
		car1 = new CarD();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
		
	}

}


class CarD
{
	int num;
	double gas;


void show()
{
System.out.println("�����O" +num);
System.out.println("�T�o�q�O" +gas);
}
}
