package kavya_path_07_Constructors;

//same methods with different parameters
public class T003_Constructor_overloading {
	int id;
	String name;
	float sal;
	
	T003_Constructor_overloading(){
		id=101;
		name="raj";
		sal=60000f;
	}
	T003_Constructor_overloading(int i,String s,float f) {
		id=i;
		name=s;
		sal=f;
	}
	T003_Constructor_overloading(int i,String s) {
		id=i;
		name=s;
	}
	void Display() {
		System.out.println("employe id is " +id);
		System.out.println("employe name is " +name);
		System.out.println("employess sal is " +sal);
	}

	
	public static void main(String[] args) {
		T003_Constructor_overloading obj1 = new T003_Constructor_overloading();
		obj1.Display();
		
		System.out.println(" ");
		T003_Constructor_overloading obj2 = new T003_Constructor_overloading(25,"seetha",55.5f);
		//obj2.Display();
		obj2.Display();
		
		System.out.println(" ");
		T003_Constructor_overloading obj3 = new T003_Constructor_overloading(777,"ramu");
		//obj2.Display();
		obj3.Display();
	}
}
