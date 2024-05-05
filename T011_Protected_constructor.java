package kavya_path_07_Constructors;

class person_02 {
	protected person_02(){
		System.out.println("This is protected Constructor");
	}
}

public class T011_Protected_constructor extends person_02 {
	private int id;
	private String name;
	T011_Protected_constructor( int id, String name) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name= name;
	}
	
	
	public static void main(String[] args) {
		T011_Protected_constructor obj = new T011_Protected_constructor(67, "kavya");
		System.out.println("id "+obj.id);
		System.out.println("name "+obj.name);
		
	}
}
