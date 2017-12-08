package collection;

public class Employee implements Comparable<Employee>{

	int age;
	int salary;
	int id;
	
	public Employee(int setage) {
		age = setage;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Override
	public int compareTo(Employee o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + "]";
	}
	
	
}
