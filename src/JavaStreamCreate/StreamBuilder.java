package JavaStreamCreate;

import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream  = Stream.<String>builder()
		        .add("XML")
		        .add("Java")
		        .add("CSS")
		        .add("SQL")
		        .build();
		    stream.forEach(System.out::println);
	}

}
