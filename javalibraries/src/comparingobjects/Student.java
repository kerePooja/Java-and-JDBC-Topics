package comparingobjects;

public class Student {
	
	int age;
	
	Student(int age){
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {//Upcasting
		
		  Student s=(Student)obj;//Downcasting
		  return this.age == age;//logic//s1-->this //s2-->obj->s
		
	}
	public static void main(String[] args) {
		
		Student s1=new Student(22);
		Student s2=new Student(22);
		
		System.out.println(s1 == s2);//false// it is comparing address
		System.out.println(s1.equals(s2));// it is comparing the addresses
	}

}
