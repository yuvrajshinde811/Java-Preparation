package java_oops;
import java.util.*;

public class oops {

	public static void main(String[] args) {
		
		System.out.println("This is oops in java");
		
		// data of 5 students = {rollno, name, marks}
//		int[] rollno = new int[5];
//		String[] name = new String[5];
//		float[] marks = new float[5];
		
		
		// creating our own class with datatype
//		Student[] students = new Student[5];
		
//		System.out.println("student array - " + Arrays.toString(students));
		
		Student yuvraj = new Student();
		
//		yuvraj.rno = 101;
//		yuvraj.name = "Yuvraj Shinde";
//		yuvraj.marks = 86.4f; 
		
		// to avoid this type of repeatative code we use costructor as shown below (Student())
		System.out.println(yuvraj.rno);
		System.out.println(yuvraj.name);
		System.out.println(yuvraj.marks);
		
		yuvraj.greet();
	
	}
	
}

// create a class for every single student
class Student{
	int rno;
	String name;
	float marks = 90;

	
	void greet() {
		System.out.println("hi i'm "+ name);
	}
	
	Student(){
		// this keyword is used to access the object or instance of class
		this.rno = 101;
		this.name = "Yuvraj Shinde";
		this.marks = 86.4f; 
	}
}
