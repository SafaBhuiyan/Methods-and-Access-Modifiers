package methods;

public class MixedMethods {
	public static void main(String[] args) {
		
		MixedMethods mix = new MixedMethods();
		mix.instanceMethod();
		staticMethod();
			
	}
	public static void staticMethod() {
		System.out.println("This is a Static Method");
		MixedMethods mix = new MixedMethods();
		mix.instanceInsideStatic();
		
	}
	public void instanceMethod() {
		System.out.println("This is an Instance Method");
		staticInsideIsntane();
	}
	
	public static void staticInsideIsntane() {
		System.out.println("This is a Static Method inside Instance Method");
	}
	
	public void instanceInsideStatic() {
		System.out.println("This is an Instance Method inside Static Method");
	}


}
