package kavya_path_07_Constructors;
//instance of a class
public class T001_constructors_01 {
	int id;
	String name;
    float salary;
    
    T001_constructors_01(){
    	id=55;
    	name="sai";
    	salary=4555f;
    }
    void admin() {
    	System.out.println("id = "+id);
    	System.out.println("name = "+name);
    	System.out.println("salary ="+salary);
    }
    void user() {
    	System.out.println("user id is= "+id);
    	System.out.println(" full name of user = "+name);
    }
    
    
	
	public static void main(String[] args) {
		T001_constructors_01 obj=new T001_constructors_01();
		obj.admin();
		obj.user();
	}
}
