
public class p14 {
	public static void main(String[] args)
	{
		CarF car1;
		car1 = new CarF();
		
		car1.setNum(1234);
		car1.setGas(20.5);
		
		
	}

}


class CarF
{
	int num;
	double gas;


void setNum(int n)
{
	num = n;
	System.out.println("�N�����]��" +num);

}
void setGas(double g)
{
	gas = g;
	System.out.println("�N�T�o�q�]��" +gas);
}

}
