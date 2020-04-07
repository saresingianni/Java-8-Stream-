package JavaStreamFromFunctions;

import java.util.stream.Stream;

public class StreamIterate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stream.iterate(2L, n  ->  n  + 1)
		    .filter(StreamIterate3::isOdd)
		    .skip(100)
		    .limit(5)
		    .forEach(System.out::println);
		  }
		  public static boolean isOdd(long number) {
		    if (number % 2 == 0) {
		      return false;
		    }
		    return true;
		  }
	}


