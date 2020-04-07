package javaOptional;

import java.util.Optional;

public class OptionalifPresent {
	
	public static void main(String[] args) {
	
	Optional<String> str = Optional.of("java2s.com");

	    str.ifPresent(value -> System.out.println("Optional contains " + value));
}
}