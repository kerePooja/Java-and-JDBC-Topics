package storingobjects;

public class Student {

	int age;
	String name;
	
	Student(int age,String name){
		this.age=age;
		this.name=name;
		}
     
	public static void main(String[] args) {
		Student s1=new Student(26,"pooja");
		Student s2=new Student(25,"shinoy");
		Student s3=new Student(26,"naveen");
		
		// array creation as primitive type int[] a=new int[3];
		
		Student[] s=new Student[3];//creating an array of  student in non-primitive type
	
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		//without overriding toString 
		for(int i=0;i<=s.length-1;i++) {
			//System.out.println(s[i]); //s[i] means it is pointing to the index and index address
			System.out.println(s[i].age+" "+s[i].name);
		}
		System.out.println("---------");
	}
	
}
