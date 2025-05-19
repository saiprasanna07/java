package day_6;
class case1{
	final void show()
	{
		System.out.println("hello");
	}
}

public class finalmethod  extends case1 {
	void show() {
		int a=96;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}
	public static void main(String[] args) {
		finalmethod f=new finalmethod ();
		f.show();
	}

}
