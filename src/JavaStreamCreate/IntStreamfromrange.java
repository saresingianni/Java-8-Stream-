package JavaStreamCreate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamfromrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IntStream oneToFive  = IntStream.range(1, 6);
		    IntStream oneToFive2  = IntStream.rangeClosed(1, 5);
		    oneToFive.forEach(System.out::println);
		    
		    System.out.println("********");
		    oneToFive2.forEach(System.out::println);
	}

}
