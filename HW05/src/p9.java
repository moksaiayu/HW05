
public class p9 {
	public static void main(String[] args)
	{
		CarC car1;
		car1 = new CarC();
		
		car1.num = 1234;
		car1.gas = 20.5;
	}

}


class CarC
{
	int num;
	double gas;


void show()
{
System.out.println("�����O" +this.num);
System.out.println("�T�o�q�O" +this.gas);
}
}