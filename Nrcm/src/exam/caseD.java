package exam;

interface cafe{
	void cafes();
}
interface near{
	void Near();
}
class fav{
	void dish() {
		System.out.println("My favourite is Pizza ");
	}
}
class place extends fav implements cafe,near{
	public void places() {
		System.out.println("Infinity,Chicke,Pizza ");
	}
	public void cafes() {
		System.out.println("Cafes in Hyderabad : ");
	}
	public void Near() {
		System.out.println("Near by Kompally are : ");
	}
}

public class CaseC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fav f1=new fav();
		place p1=new place();
		p1.cafes();
		p1.Near();
		p1.places();
		f1.dish();

	}

}

