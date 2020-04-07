package javaStreamAPI;

import java.util.Arrays;
import java.util.List;

public class OrderedStreamsvsunorderedStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> numbers = Arrays.asList(3,7,9,3,1,2,1, 2, 3, 4, 5);
		    numbers.stream()
		        .filter(n -> n % 2  == 1)
		        .sorted()
		        .forEach(System.out::println);
	}

}
