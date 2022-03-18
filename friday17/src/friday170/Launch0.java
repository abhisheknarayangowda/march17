package friday170;
class You
{
	private int acc_no;
	private int pswd;
	You()
	{
	acc_no=2222;
	pswd=3333;
}
}
class friend extends You
{
	void changeData()
	{
		acc_no=8888;
		pswd=9999;
	}
}
public class Launch0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Friend f = new friend();
f.changeData();
	}

}
Result  = cannot inherited because we given private 