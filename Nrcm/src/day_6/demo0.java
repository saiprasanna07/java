package day_6;

public class demo0 {
		int a=20;
		int b=10;
		void add() {
		System.out.println("addition is"+a+" and "+b+" is :"+(a+b));
	}
		void sub() {
			System.out.println("addition is:");
			System.out.println("a: "+ this.a);
			System.out.println("b: "+ this.b);
			this.add();	
		}
		public static void main(String[] args) {
			demo0 k=new demo0();
			k.sub();
		}
}
		