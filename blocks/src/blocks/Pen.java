package blocks;

public class Pen {
	
	static int x=10;
	static 
	{
		x=20;
	}

	public static void main(String[] args) 
		{
			Pen p=new Pen();
			System.out.println(x);
			
		}
		{
			x=30;
		}

	}


