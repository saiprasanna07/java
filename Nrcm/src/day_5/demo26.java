package day_5;
class sample45{
	public sample45() {
		System.out.println("Good Evening");
	}
	int x=99;
	void print() {
		System.out.println("Hello");
	}
}

public class demo26  extends sample45{
	public demo26() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		demo26 t1=new demo26();
		t1.show();
	}
	

}
