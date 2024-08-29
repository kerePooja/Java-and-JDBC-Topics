package Day2;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
        l.add(10);
        l.add(20);
        l.add(30);
        
        System.out.println(l);
        System.out.println("-------------");
        
        for(int i=0;i<l.size(); i++) {//traverse of collection
        	System.out.println(l.get(i));
        }
        
        System.out.println("-------------");
        
        // for(int i=2;i>=0; i--) haed coding we cant use 
        for(int i=l.size()-1;i>=0; i--) {//traverse of collection
        	System.out.println(l.get(i));
        }
        
        System.out.println("-------------");
        
        int[] X = {10,20,30};
        System.out.println(X.length);//length of array
        
        String y="java";
        System.out.println(y.length());//size of java it will print
        
        System.out.println(l.size());//size of collection
        
     }

}
