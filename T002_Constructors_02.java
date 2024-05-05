package kavya_path_07_Constructors;

public class T002_Constructors_02 {
	int id;
	String name;
	String Address;
	float Salary;

	T002_Constructors_02() {
		id = 356;
		name = "yashu";
		Address = "Banglore";
		Salary = 40000f;
	}

	void m1() {
		System.out.println("user is " + id);
		System.out.println("user name is " + name);
		System.out.println("user name is "+ Address);
		System.out.println("user name is "+ Salary);
	}

	public static void main(String[] args) {
		T002_Constructors_02 obj = new T002_Constructors_02();
		obj.m1();
	}
}
