package JavaStreamMap;

import java.util.stream.Stream;

public class StreamsflatMap {
	
	public static void main(String[] args) {
	
	
	Stream.of(1, 2, 3)
    .flatMap(n -> Stream.of(n, n+1))
    .forEach(System.out::println);
}
}