package javaOptional;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamOptionalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    OptionalInt maxOdd = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();
	    if (maxOdd.isPresent()) {
	      int value = maxOdd.getAsInt();
	      System.out.println("Maximum odd  integer is " + value);
	    } else {
	      System.out.println("Stream is  empty.");
	    }
	}

}
