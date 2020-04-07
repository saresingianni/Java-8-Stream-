package JavaStreamCreate;

import java.util.stream.Stream;

public class CreateStreamsfromValues3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stream<String> stream  = Stream.of("XML", "Java",  "CSS", "SQL");
		    stream.forEach(System.out::println);
	}

}
