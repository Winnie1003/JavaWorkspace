package info;

public class Student {
	
	public Student() {
	}
	
	//Generate constructor
	public Student(String name, int age, String gender, String phone, String adress, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.adress = adress;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Define the students' attributes
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String adress;
	private String email;
	
	//eat
	public void eat() {
		System.out.println("��");
	}
	//drink
	public void drink() {
		System.out.println("��");
	}
	//eat
	public void play() {
		System.out.println("��");
	}
	//eat
	public void sleep() {
		System.out.println("˯");
	}
	
}
