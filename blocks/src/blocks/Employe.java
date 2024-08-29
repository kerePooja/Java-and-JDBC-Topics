package blocks;

public class Employe {
	
	int id;
	{
		System.out.println("Initializing id to 10");
		id =10;
	}
	

	public static void main(String[] args) {
			Employe e = new Employe();
			System.out.println("ID: "+e.id);
			
		}
		
		{
			System.out.println("Initializing id to 10");
			id=20;
		}

	}


