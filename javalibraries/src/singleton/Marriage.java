package singleton;

public class Marriage {
	
	int age=29;
	
	private static Marriage M;
	
	private Marriage() {
		System.out.println("ready for marriage");
	}

	public static Marriage createObjAndReturnOfMarriage() {
		if(M==null) {
			M = new Marriage();
		}
		return M;
	}
}
