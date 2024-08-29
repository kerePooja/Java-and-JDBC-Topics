package Day4;
import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		
		Student s1=new Student(27,"pooja");
		Student s2=new Student(23,"shinoy");
		Student s3=new Student(21,"tom");
		
		ArrayList<Student> al=new ArrayList<Student>();//Student is non-primitive object
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student s:al) {
			System.out.println(s);
			System.out.println("name:"+s.name+" age: "+s.age);
		}
		
		
	}

}
