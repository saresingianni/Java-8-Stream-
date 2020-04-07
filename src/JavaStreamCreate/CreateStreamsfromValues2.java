package JavaStreamCreate;

import java.util.stream.Stream;

public class CreateStreamsfromValues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "XML", "Java", "SQL", "CSS" };
	    Stream<String> stream = Stream.of(names);
	    stream.forEach(System.out::println);
	}

}
