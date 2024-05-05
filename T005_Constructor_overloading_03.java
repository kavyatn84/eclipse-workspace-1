package kavya_path_07_Constructors;

//wajp to create person_01 class person_01 entites are id,height,weight,

//create four constuctors with name of person_01 const1 = noargs,
//const2 = 1 args ie., int;
class person_01 {
	int id;
	float height;
	double weight;

	person_01() {
		System.out.println("no parameters for this condition");
		id = 0;
		height = 0;
		weight = 0;

	}

	person_01(int id) {
		System.out.println("one parameter for this constructor " );
		this.id = id;
		height = 0;
		weight = 0;

	}

	person_01(float height, double weight) {
		System.out.println("two parameters for this constructor " );
		id=0;
		this.height = height;
		this.weight = weight;

	}

	person_01(int id, float height, double weight) {
		System.out.println("three parameters for this constructor ");
		this.id = id;
		this.height =height;
		this.weight = weight;

	}
	public String toString() {
		return "id:"+id+"\t height:"+height+"\t weight"+weight;
	}
//	void Display() {
//		System.out.println("person_01 id is " + id);
//		System.out.println("person_01 height is " + height);
//		System.out.println("person_01 weight is " + weight);
//}

}

public class T005_Constructor_overloading_03 {

	public static void main(String[] args) {
		person_01 obj = new person_01();
		System.out.println(obj);

		System.out.println(" ");
		person_01 obj1 = new person_01(3456);
		System.out.println(obj1);

		System.out.println(" ");
		person_01 obj2 = new person_01(5.6f,65);
		System.out.println(obj2);

		System.out.println(" ");
		person_01 obj3 = new person_01(3456, 5.6f,65);
		System.out.println(obj3);

	}
}
