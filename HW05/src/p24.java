
public class p24 {
	public static void main(String[] args)
	{
		CarK car1;
		car1 = new CarK();
		
		car1.setCar(1234, 20.5);
		car1.show();
		
		System.out.println("�u�ܧ󨮸�");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("�u�ܧ󨮸�");
		car1.setCar(30.5);
		car1.show();
		
	}
	static class CarK
	{
		private int num;
		private double gas;
		
		public void setCar(int n)
		{
			num = n;
			System.out.println("�N�����]��"+num);
		}
		
		private void setCar(double g)
		{
			gas = g;
			System.out.println("�N�T�o�q�]��"+gas);
		}
		
		private void setCar(int n, double g)
		{
			num = n;
			gas = g;
			System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
		}
		
		public void show()
		{
			System.out.println("�����O"+this.num);
			System.out.println("�T�o�q�O"+this.num);
		}
	
	}
}