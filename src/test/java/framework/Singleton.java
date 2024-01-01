package framework;

public class Singleton {

	private static Singleton singleton_ref = null;

	private Singleton() {
		System.out.println("This is Singleton Class");
	}

	public static Singleton getInstance() {
		if (singleton_ref == null)
			singleton_ref = new Singleton();
		return singleton_ref;
	}

}
