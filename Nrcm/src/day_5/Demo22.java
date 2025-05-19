package day_5;

public class Demo22 {
	void show() {
		System.out.println("good morning");
	}
	void show(int a,int b) {
		System.out.println("addition:"+ a+b);
	}
	void show (double d,double d1) {
		System.out.println("subtraction:"+ (d-d1));
	}// compile polymorphism
	void show(String s,String s1) {
		System.out.println("name:"+ s+s1);
	}
	public static void main(String[] args) {
		Demo22 D1=new Demo22();
		D1.show();
		D1.show(2,3);
		D1.show(4d,5d);
		D1.show("hi","sai");
	}
	

}
