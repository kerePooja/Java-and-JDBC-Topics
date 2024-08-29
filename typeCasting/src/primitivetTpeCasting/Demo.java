package primitivetTpeCasting;

public class Demo {

	public static void main(String[] args) {
	System.out.println("-------widening-----");
	
	int a=10;
	double b=a;
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("------------");
	
	char c='A';
	int d=c;
	System.out.println(c);
	System.out.println(d);
	
    System.out.println("-------Narrowing-----");
	
	double x = 10.55;
	int y= (int) x;
	System.out.println(x);
	System.out.println(y);
	
	System.out.println("------------");
	
	int A=65;
	char B=(char)A;
	System.out.println(A);
	System.out.println(B);
	
	System.out.println("===================");
	System.out.println("A"+"B");
	
	System.out.println("A"+20);
	
	System.out.println('A'+'B');//Ascii value of a&b is 65 and 66 sum of them is 131
	
	System.out.println('a'+20);
	
	System.out.println('a'+"a");//anything concatinating with string is returns string
	}

}
