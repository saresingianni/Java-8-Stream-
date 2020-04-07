package StreamsfromCharSequence;

import java.util.regex.Pattern;

public class StreamsfromRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "XML,CSS,HTML"; 
		    Pattern.compile(",")
		    .splitAsStream(str)
		    .forEach(System.out::println);

	}

}
