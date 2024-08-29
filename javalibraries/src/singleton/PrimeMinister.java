package singleton;

public class PrimeMinister {
	 
	String name="MODI";
	
    private static PrimeMinister PM;
	private PrimeMinister() {
		System.out.println("PM is evicted");
	}
	
	
   public static PrimeMinister ObjectOfPM() {
		 if(PM==null) {
		    PM =new PrimeMinister();
		 }
		return PM;
	}
}
