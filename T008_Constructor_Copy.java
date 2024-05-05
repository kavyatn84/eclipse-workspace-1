package kavya_path_07_Constructors;

public class T008_Constructor_Copy {
	private int id;
	private String name;

	T008_Constructor_Copy(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;

	}
	T008_Constructor_Copy(T008_Constructor_Copy obj) {
		// TODO Auto-generated constructor stub
		this.id = obj.id;
		this.name=obj.name;
	}

	public static void main(String[] args) {
		T008_Constructor_Copy obj = new T008_Constructor_Copy(78, "java");
		System.out.println("id " + obj.id);
		System.out.println("name" + obj.name);
		T008_Constructor_Copy obj1 = new T008_Constructor_Copy(obj);
		System.out.println("id"+obj1.id);
		System.out.println("name "+obj1.name);
	}
}
