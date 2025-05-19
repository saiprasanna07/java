package exam;


interface Groceries{
	void groceries();
}
interface households{
	void Households();
	
}
class Test1{
	void Juice() {
		System.out.println(" Juice brands are:Thumbs,7Up,Pepsi");
	}
}
class Test2 extends Test1 implements Groceries,households{
	public void chocolate() {
		System.out.println("Chocolate are: Dairy milk,Snickers");
	}
	public void groceries() {
		System.out.println("Groceries list are: Dal,Red chilli powder,Salt,Turmeric");
	}
	public void Households() {
		System.out.println("HOuseholds things are: mop Stick,Bucket,vessels");
	}
}
class Test3 extends Test2{
	public void expenses() {
		System.out.println("One month expenses are: 30000");
	}
}

public class caseE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		t2.chocolate();
		t2.Juice();
		t2.groceries();
		t2.Households();
		t1.Juice();
		t3.expenses();
		t3.chocolate();

	}

}

