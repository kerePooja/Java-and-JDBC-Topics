package constructorchaining;

public class Student {
    
	 Student(int age){
		 this("tom");
		 System.out.println("age: "+age);
	 }
	
	 Student(double height){
		 this(22);
		 System.out.println("height: "+height);
	 }
	 
	 Student(){
		 this(7.8);
		 System.out.println("i am calling in this constructor properties of another constructor");
	 }
	
	 
	 Student(String name){
		 System.out.println("name: "+name);
	 }
	
public static void main(String[] args) {
	Student s=new Student();
}
}
