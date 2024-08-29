package methodOverriding;

public class Instragram2 extends Instragram1 {
   
	 @Override
	 void upload() {
		super.upload();
		System.out.println(" Now you can upload Images and also GIF files");
	}
	
	void DM() {
		System.out.println("  you can Text the person you like");
	}
}
