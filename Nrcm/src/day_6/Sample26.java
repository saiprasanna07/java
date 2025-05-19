package day_6;

class Sample27 {
	static void show() {
		System.out.println("hi");
	}
	static class Test25{
		static void print() {
			System.out.println("hello");
			show();
		}
	}

}
public class Sample26 {
	public static void main(String[] args) {
		Sample27.Test25.print();
	}
}
