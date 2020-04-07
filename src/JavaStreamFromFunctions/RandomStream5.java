package JavaStreamFromFunctions;

import java.util.Random;
import java.util.stream.Stream;

public class RandomStream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Stream.generate(new Random()::nextInt)
	    .limit(5)
	    .forEach(System.out::println);
	}

}
