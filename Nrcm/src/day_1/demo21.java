package day_1;
class Movies{
	void genere() {
	System.out.println("crime and thiller");
}
}
class Hit extends Movies{
	void action() {
		System.out.println("investigation");
	}
}
class Hero extends Hit {
	void name()
	{
		System.out.println("nani");
	}
}
class Heroin extends Movies{
	void look()
	{
		System.out.println("good");
	}
}
public class demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero a1=new Hero();
		Heroin m1=new Heroin();
		a1.action();
		a1.genere();
		a1.name();
		m1.look();

	}

}
