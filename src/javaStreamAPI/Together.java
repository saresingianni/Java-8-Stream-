package javaStreamAPI;
import java.util.Arrays;
import java.util.List;

public class Together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		    int sum = numbers.stream()
		        .filter(n -> n % 2  == 1)
		        .map(n  -> n * n)
		        .reduce(0, Integer::sum);

		    System.out.println(sum);
	}

}
