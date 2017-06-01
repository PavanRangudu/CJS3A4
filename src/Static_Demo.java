
public class Static_Demo {

	static {
		/** @Output */
		System.out.println("Hello i will execute first");
	}

	/** @Method Declaration */
	void show() {
		/** @Output */
		System.out.println("I am a method ");
	}

	public static void main(String[] args) {
		Static_Demo obj = new Static_Demo();
		obj.show();

	}

}
