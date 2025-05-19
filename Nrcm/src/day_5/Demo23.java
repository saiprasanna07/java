package day_5;

class Demo1 {
	void add() {
		System.out.println("hi");
		
	}

}
public class Demo23 extends Demo1{
	void add() {
		 System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo23 d1=new Demo23();
		d1.add();
				}
}
