package friday172;
class Demo1 
{
	int i=9;
}
class Demo2 
{
	int i=99;
}
class Demo3 extends Demo1,Demo2
{
	void disp()
	{
		System.out.println(i);
	}
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo3 d = new Demo3();
d.disp();
	}

}

Result = multiple inheritance is not possible