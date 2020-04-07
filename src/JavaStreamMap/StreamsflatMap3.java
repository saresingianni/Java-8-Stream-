package JavaStreamMap;

import java.util.stream.Stream;

public class StreamsflatMap3 {
	
	public static void main(String[] args) {
	
		 Stream.of("XML", "Java",  "CSS")
	        .map(name  ->  name.chars())
	        .flatMap(intStream ->  intStream.mapToObj(n ->  (char)n))
	        .forEach(System.out::println); 
}
}