package singleton;

public class MySingleton {

	private static MySingleton obj;
	
	static{
		obj= new MySingleton();
	}
	private MySingleton(){
		
	}
	public static MySingleton getInstance(){
		return obj;
	}
	
	public void test(){
		System.out.println("Hey....Its working sexy");
	}
	public static void main(String[] args) {
		MySingleton ms= new MySingleton();
		ms.test();

	}

}
