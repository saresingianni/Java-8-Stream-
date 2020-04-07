package JavaStreamCreate;

import java.util.stream.Stream;

public class EmptyStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stream<String> stream  = Stream.empty();
		    stream.forEach(System.out::println);
	}

}
