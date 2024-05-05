package kavya_path_07_Constructors;

public class T007_Parametrized_Constructor {
	private int id;
	private String name;

	T007_Parametrized_Constructor(int id, String name) {
		// TODO Auto-generated constructor stub.
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		T007_Parametrized_Constructor obj = new T007_Parametrized_Constructor(89, " java");
		System.out.println("id: " + obj.id);
		System.out.println("name" + obj.name);
	}
}
