package clientApp;

import differentModifires.CheckModifiers;

public class AccessProtected extends CheckModifiers {

	public static void main(String[] args) {
		AccessProtected pro = new AccessProtected();
		pro.protectedfunc();
		
		// As AccessProtected Class is a child class of CheckModifiers Class,
		// AccessProtected Class will inherit the methods of CheckModifiers Class,
		// Hence, We have created an Instance of AccessProtected Class to call the
		// protected method

	}

}
