package kavya_path_07_Constructors;

public class T009_Constructor_method_calling {

	private int id;
	private String name;

	T009_Constructor_method_calling(int id, String name) {
		// TODO Auto-generated constructor stub.
		this.id = id;
		this.name = name;
		Display();
	}
	void Display() {
		System.out.println("id: " + id);
		System.out.println("name" + name);
	}
	
	public static void main(String[] args) {
		T009_Constructor_method_calling obj = new T009_Constructor_method_calling(89, " java");
		
	}
}
