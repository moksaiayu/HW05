
public class p12 {

	public static void main(String[] args)
	{
		CarE car1;
		car1 = new CarE();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	}

}


class CarE
{
	int num;
	double gas;


void show()
{
System.out.println("�����O" +this.num);
System.out.println("�T�o�q�O" +this.gas);
}
void showCar()
{
	System.out.println("�}�l��ܨ��l���");
	this.show();
}
}
