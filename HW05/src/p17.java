
public class p17 {

	public static void main(String[] args)
	{
		CarH car1;
		car1 = new CarH();
		car1.setNumGas(1234, 20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O" +number+"�A�T���q�O"+gasoline);
		
		
	}

}


class CarH
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	double getGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}

void setNumGas(int n, double g)
{
	num = n;
	gas = g;
	System.out.println("�N�����]��" +num+"�A�T���q�]��"+gas);

}

}
