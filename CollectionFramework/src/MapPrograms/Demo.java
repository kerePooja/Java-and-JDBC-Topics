package MapPrograms;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		
		HashMap hm =new HashMap();

		//h.add();//add method is present in collection interface as HashMap is impliments collection so 
		
		hm.put(10,"dinga");
		hm.put(10.44,"pooja");
		hm.put(1.2, 100);
		
		System.out.println(hm);
		
		System.out.println("---------------");
		
		//get() is used to get an value based on the key specified
		System.out.println(hm.get(10));
		System.out.println(hm.get(200));
		
		System.out.println("---------------");
		//containsKey() is used to check if the key is present or not
		System.out.println(hm.containsKey("Dinga"));
		System.out.println(hm.containsKey(10.44));
		
		//containsValue() is used to check if the value is present or not
		System.out.println("---------------");
		System.out.println(hm.containsValue(10.44));
		System.out.println(hm.containsValue("pooja"));
		System.out.println(hm.containsValue("Pooja"));
		
		System.out.println("---------------");
		
		System.out.println(hm);
		//remove() is used to remove key and value based on the key specified
		hm.remove(10);
		
		System.out.println(hm);
		
		System.out.println("---------------");
		//isEmpty() is used to check if the collection is empty or not
		System.out.println(hm.isEmpty());
		//clear() is used to remove all the objects
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
		
		
	}

}
