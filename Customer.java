/*Customer class*/

public class Customer {
	private String name;
	private int age;
	private char student;
	
	/*constructor*/
	public Customer(String name, int age, char student){
		this.name = name;
		this.age = age;
		this.student = student;
	}
	
	/*default constructor*/
	public Customer(){
		this.name = "Unknown";
		this.age = 0;
		this.student = 'N';
	}
	
	/*data encapsulation*/		
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
	
	public char getStudent() {
		return student;
	}

	public void setStudent(char student) {
		this.student = student;
	}
	
	/*toString	method*/
	public String toString(){
		return this.name+" age: "+this.age+" Student? "+this.student;
	}
	
}
