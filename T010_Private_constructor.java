package kavya_path_07_Constructors;

public class T010_Private_constructor {
	 private int id;
	 private String name;
	 
	 private T010_Private_constructor(int id,String name) {
		 System.out.println("This is private constructor");
		 this.id = id;
		 this.name = name;
	 }
	public static void main(String[] args) {
		T010_Private_constructor obj=new T010_Private_constructor(89,"java");
		System.out.println("id "+obj.id);
		System.out.println("name"+obj.name);
	}

}
