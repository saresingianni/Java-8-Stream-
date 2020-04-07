package JavaStreamCreate;

import java.util.stream.Stream;

public class CreateStreamsfromValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream  = Stream.of("java2s.com");
	    stream.forEach(System.out::println);
	}

}
