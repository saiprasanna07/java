package day_5;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}
public class demo25 implements I3 {
	public void add() {
		System.out.println("sai");
	}
	public void sub() {
		System.out.println("prasanna");
	}
	public void mul() {
		System.out.println("kumar");
	}
	public static void main(String[] args) {
		demo25 b1=new demo25();
		b1.add();
		b1.sub();
		b1.mul();
	}

}
