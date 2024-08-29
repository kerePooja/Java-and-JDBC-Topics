package methodOverriding;

public class WhatsApp3 extends WhatsApp2 {
	        @Override
	         void display() {
		     super.display();
		     System.out.println("BlueTick tick supported");
		       }
	            @Override
	    	    void call() {
	    	    	super.call();
	    	    	System.out.println("voice call Supported");
	    	    	System.out.println("video call Supported");
	    	    }
	            
	            void story() {
	            	System.out.println("can uplod images as story");
	            }

	public static void main(String[] args) {
		WhatsApp3 W3=new WhatsApp3();
		W3.display();
	    System.out.println("-----------");
	     W3.call();
		 System.out.println("-----------");
		 W3.story();
	}

}
