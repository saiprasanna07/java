package day_1;
class Bike{
	void Speed() {
		System.out.println("250 km per hour");
	}
}
class Bmw extends Bike {
	void rev() {
		System.out.println("1000cc");
	}
}
class Model extends Bmw{
	void price()
	{
	System.out.println("just 35 lakhs");	
	}
}
public class Demo20 {
	
	public static void main(String[] args) {
		Model d1=new Model();
		d1.Speed();
		d1.rev();
		d1.price();
	}

}
