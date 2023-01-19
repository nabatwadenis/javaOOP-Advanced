package objectJava;

class Student{

	private String name;
	private String address;
	private int age;
	
	public Student(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getAge(){
		return age;
	}
	
	@Override
	public String toString() {
		return("Student name is "+this.getName()+ "the address is "+ this.getAddress() +"and the age is "+ this.age);
	}
}
public class Encapsulation {
	
	public static void main(String[] args) {
		Student s = new Student("Derrick", "Eldoret",20);
		System.out.println(s.getAddress());

	}

}
