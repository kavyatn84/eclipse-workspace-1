package kavya_path_07_Constructors;

public class T012_Constructor_Static {
	private int id;
	private String name;
	
	static {
		System.out.println("This is static block");
	}

	T012_Constructor_Static(int id, String name) {
		// TODO Auto-generated constructor stub.
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		T012_Constructor_Static obj = new T012_Constructor_Static(89, " java");
		System.out.println("id: " + obj.id);
		System.out.println("name" + obj.name);
	}
	
}
