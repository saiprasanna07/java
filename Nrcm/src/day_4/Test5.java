package day_4;

public class Test5 {
	int a=90;
	public Test5(int b) {
		b=a;
		System.out.println("Good Morning"+a);
	}
	public static void main(String[] args) {
		Test5 t1=new Test5(45);
		Test5 t2=new Test5(56);
        Test5 t3=new Test5(34);

	}

}
