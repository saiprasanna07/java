package day_5;
interface I1{
	void add();
}
interface I2{
	void sub();
}
public class demo24 implements I1,I2 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		demo24 t1=new demo24();
		t1.add();
		t1.sub();
	}

}
