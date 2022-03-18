package feiday173;
class Demo1
{
	void disp1()
	{
		System.out.println("Sri");
	}
}
class Demo2 extends Demo1
{
	void disp2()
	{
		System.out.println("Sharada");
	}
}
	class Demo3 extends Demo2
	{
		void disp3()
		{
			System.out.println("Devi");
		}
	}

public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo3 d = new Demo3();
d.disp1();
d.disp2();
d.disp3();// multiple inheritance is not possible but multilevel inheritance is possible
	
	}
}



