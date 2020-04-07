package JavaStreamFromFunctions;

import java.util.Random;

public class RandomStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Random().ints()
		    .limit(5)
		    .forEach(System.out::println);
	}

}
