package day_6;

public class sample23 {
	void show() {
		System.out.println("HI");
	}
	class Test23{
		void print() {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample23 s1=new sample23();
		s1.show();
		sample23.Test23 t1=new sample23().new Test23();
		t1.print();

	}

}
