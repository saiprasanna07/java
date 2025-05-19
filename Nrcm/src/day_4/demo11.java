package day_4;

public class demo11 {
	private String firstName;
	private String lastName;
	private String Email;
	
	public void setFirstname(String fn) {
		firstName=fn;
	}
	public void setLastname(String ln) {
		lastName=ln;
	}
	public void setEmail(String id) {
		Email=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return Email;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11 d1=new demo11();
		d1.setFirstname("sai");
	    d1.setLastname("varma");
	    d1.setEmail("sai9687@gmail.com");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmail());

	}

}