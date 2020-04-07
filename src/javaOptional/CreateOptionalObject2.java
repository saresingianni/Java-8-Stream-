package javaOptional;
import java.util.Optional;
public class CreateOptionalObject2 {
   
	public static void main(String[] args) {
		Optional<String> str = Optional.of("java2s.com");

	    if (str.isPresent()) {
	      String value = str.get();
	      System.out.println("Optional contains " + value);
	    } else {
	      System.out.println("Optional is  empty.");
	    }
}
}
