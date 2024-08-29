package checkedAndUnchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example {

	static void readData() throws FileNotFoundException
	{
		FileReader f=new FileReader("dinga.txt");
	}
	public static void main(String[] args) {
		
		try {
			readData();
		} catch (FileNotFoundException e) {
			
			System.out.println("file not present");
		}
		
	}

}
