
public class p20 {
	public static void main(String[] args)
	{
		CarI car1;
		car1 = new CarI();
		
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
		
	}

}


class CarI
{
	int num;
	double gas;

void show()
{
System.out.println("�����O" +this.num);
System.out.println("�T�o�q�O" +this.gas);
}
}
