package exam;
interface A1{
	void add();
}
interface A2 extends A1{
	void sub();

}

 class sai1 implements A2  {
	public void add() {
		System.out.println("Well");
	}
	public void sub() {
		System.out.println("Come to");
	}
	public void mul() {
		System.out.println("Java development");
}
 }
	 class sai2 implements A2  {
			public void add() {
				System.out.println("Hi");
			}
			public void sub() {
				System.out.println("Well come");
			}
			public void mul() {
				System.out.println("Java");
			}
	 }
	 public class caseB{
		 

public static void main(String[] args) {

	sai1 b1=new sai1();
	sai2 b2=new sai2();
	
	b1.add();
	b1.sub();
	b1.mul();
	b2.add();
	b2.sub();
	b2.mul();
}
}