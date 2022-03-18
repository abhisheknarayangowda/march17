package friday171;

class You
{
	private int acc_no;
	private int pswd;
	You()
	{
		super();
	acc_no=2222;
	pswd=3333;
}
}
class friend extends You
{
	friend()
	{
	super();
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Friend f = new friend();

	}

}
Result = constructors cannot be inherited but they are getting executed because 
          of super() method call.