package JavaStreamFromFunctions;

import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.generate(Math::random)
	    .limit(5)
	    .forEach(System.out::println);
	}
}

