package exam;
interface java1{
	void add();
}
interface java2{
	void sub();
}
interface java3 extends java1,java2{
	void mul();
}

public class caseA implements java3 {
	public void add() {
		System.out.println("welcome");
	}
	public void sub() {
		System.out.println("to");
	}
	public void mul() {
		System.out.println("java development");
}

public static void main(String[] args) {
	caseA b1=new caseA();
	b1.add();
	b1.sub();
	b1.mul();
}
}
