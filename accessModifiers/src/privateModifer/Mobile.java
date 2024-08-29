package privateModifer;

public class Mobile {
		//within the class only we can access
		 private void chat() {
			System.out.println("private chats");
		}

		public static void main(String[] args) {
		   Mobile m=new Mobile();
		   m.chat();

		}

	}

