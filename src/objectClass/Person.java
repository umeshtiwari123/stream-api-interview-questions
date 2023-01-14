package objectClass;

public class Person {

	private String name;
	private int age;
	private int sal;

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	

}
