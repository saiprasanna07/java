package day_6;
// inner class method
public class Sample24 {
	void show() {
		System.out.println("Good afternoon");
		class Test24{
			void print() {
	System.out.println("hello");
		}
	}
	Test24 t1=new Test24();
	t1.print();
	}
public static void main(String[] args) {
	Sample24 s1=new Sample24();
	s1.show();
}
}
