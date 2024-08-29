package storingobjects;

public class Person {
	int age;
	String name;
	
	Person(int age,String name){
		this.age=age;
		this.name=name;
		}
	
	public String toString() {
		return "age:"+this.age+" name:"+this.name;
		
	}

	public static void main(String[] args) {
		Person p1=new Person(23,"pooja");
		Person p2=new Person(24,"shinoy");
		Person p3=new Person(25,"naveen");
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
		
		Person[] p=new Person[3];
		p[0]=p1;
		p[1]=p2;
		p[2]=p3;
		
		for(int i=0;i<=p.length-1;i++) {
			System.out.println(p[i]);
		}
	}

}
