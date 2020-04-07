package JavaStreamMap;

import java.util.stream.IntStream;

public class InitStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IntStream.rangeClosed(1, 5)
         .map(n -> n * n)
         .forEach(System.out::println);
	}

}
