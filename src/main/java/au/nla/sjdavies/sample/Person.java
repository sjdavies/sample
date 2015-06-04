package au.nla.sjdavies.sample;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Person {

	//@Id
	private int id;
	private String name;
	private String phone;
	private String email;
		
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
