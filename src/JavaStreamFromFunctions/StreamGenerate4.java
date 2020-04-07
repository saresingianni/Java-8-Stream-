package JavaStreamFromFunctions;

import java.util.stream.Stream;

public class StreamGenerate4 {

	public static void main(String[] args) {
		Stream.generate(StreamGenerate4::next)
	    .limit(5)
	    .forEach(System.out::println);

	  }
	  
	  static int i=0;
	  private static int next(){
	    i++;
	    return i;
	  }
}

