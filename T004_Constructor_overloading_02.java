package kavya_path_07_Constructors;
//wajp to create person class person entites are id,height,weight,

//create four constuctors with name of person const1 = noargs,
//const2 = 1 args ie., int;
class person {
	int id;
	float height;
	double weight;

	person() {
		System.out.println("no parameters for this condition");
		id = 0;
		height = 0;
		weight = 0;

	}

	person(int id) {
		System.out.println("one parameter for this constructor " + id);
		id = 3456;

	}

	person(float height, double weight) {
		System.out.println("two parameters for this constructor " +height +","+ weight);
		height = 5.6f;
		weight = 65;

	}

	person(int id, float height, double weight) {
		System.out.println("three parameters for this constructor " + id +","+ height +","+ weight);
		id = 3456;
		height = 5.6f;
		weight = 65;

	}

	void Display() {
//		System.out.println("person id is " + id);
//		System.out.println("person height is " + height);
//		System.out.println("person weight is " + weight);
}

}

public class T004_Constructor_overloading_02 {

	public static void main(String[] args) {
		person obj = new person();
		obj.Display();

		System.out.println(" ");
		person obj1 = new person(3456);
		obj1.Display();

		System.out.println(" ");
		person obj2 = new person(5.6f,65);
		obj2.Display();

		System.out.println(" ");
		person obj3 = new person(3456, 5.6f,65);
		obj3.Display();

	}
}
