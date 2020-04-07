package JavaStreamFromFunctions;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n  ->  n  + 1)
		        .limit(10);

		    tenNaturalNumbers.forEach(System.out::println);
	}

}
