package methodOverriding;

public class Instragram3 extends Instragram2 {
	@Override
	 void upload() {
		super.upload();
		System.out.println(" Now you can upload Images and also GIF files");
	}
	@Override
	void DM() {
		System.out.println("  you can Text the person you like as well as send images also");
	}
	
	void Story() {
		System.out.println("you can upload any story");
	}

	public static void main(String[] args) {
		
		Instragram3 I3=new Instragram3();
		
		I3.upload();
		
		System.out.println("=====================");
		
		I3.DM();
		
		System.out.println("=====================");
		I3.Story();

	}

}
