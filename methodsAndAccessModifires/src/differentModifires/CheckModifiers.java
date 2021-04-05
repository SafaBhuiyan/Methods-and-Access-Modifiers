package differentModifires;

//Java does not support any "private" and "protected" Access modifiers for Class
//Java only allow "public" and "default" Access modifiers for Class

public class CheckModifiers {
	
	public void publicfunc() {
		System.out.println("This is a Public function");
	}
	private void privatefunc() {
		System.out.println("This is a Private function");
	}
	void defaultfunc() {
		System.out.println("This is a Default function");
	}
	protected void protectedfunc() {
		System.out.println("This is a Protected function");
	}
	
	public static void main(String[] args) {
		CheckModifiers check = new CheckModifiers();
		check.privatefunc();
		//Private Method can only be Accessed from this Class only
	}
	

}
//This Class is just to show that Java allow default Access modifiers for Class
class One{
	
	
}


