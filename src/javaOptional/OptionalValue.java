package javaOptional;

import java.util.OptionalInt;

public class OptionalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			    OptionalInt number = OptionalInt.of(2);

			    if (number.isPresent()) {
			      int value = number.getAsInt();
			      System.out.println("Number is " + value);
			    } else {
			      System.out.println("Number is absent.");
			    }
	}

}
