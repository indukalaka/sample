package objectandclass;

interface Orginterface
{
	void show();
}
public class AnonymousFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orginterface obj = () -> System.out.println("Implements method functionality");
		obj.show();
	}

}
