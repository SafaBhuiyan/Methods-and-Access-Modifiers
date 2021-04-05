package clientApp;

import differentModifires.CheckModifiers;

public class Main {

	public static void main(String[] args) {

		CheckModifiers check = new CheckModifiers();
		// check.privatefunc();<----As it is private method it can not be Accessed
		// outside the class

		// check.defaultfunc();<-----As it is a default method, it can not be accessed
		// outside the Package

		// check.protectedfunc();<-----As there is no inheritance relationship between
		// the Classes, Protected method Can not be Accessed outside of the Package

		check.publicfunc();
		//The Access Modifier for method publicfunction is public, it has Project Level Visibility

	}

}
