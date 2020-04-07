package JavaStreamFromFunctions;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomStream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IntStream.generate(new Random()::nextInt)
		    .limit(5)
		    .forEach(System.out::println);
	}

}
