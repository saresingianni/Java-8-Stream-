package javaParallelStreams;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class JavaParallelStreams2 {
public static void main(String[] args) {
    String names = Employee.persons()                // The data source
            .stream()                  // Produces a  sequential  stream
            .filter(Employee::isMale)   // Processed in serial
            .parallel()               // Produces a  parallel  stream
            .map(Employee::getName)       // Processed in parallel
            .collect(Collectors.joining(", "));  // Processed in parallel
        System.out.println(names);

	    	  }
	 

	   static 	class Employee {
	    	  public static enum Gender {
	    	    MALE, FEMALE
	    	  }

	    	  private long id;
	    	  private String name;
	    	  private Gender gender;
	    	  private LocalDate dob;
	    	  private double income;

	    	  public Employee(long id, String name, Gender gender, LocalDate dob,
	    	      double income) {
	    	    this.id = id;
	    	    this.name = name;
	    	    this.gender = gender;
	    	    this.dob = dob;
	    	    this.income = income;
	    	  }
	    	  public String getName() {
	    	    return name;
	    	  }
	    	  public boolean isMale() {
	    	    return this.gender == Gender.MALE;
	    	  }
	    	  public static List<Employee> persons() {
	    	    Employee p1 = new Employee(1, "Jake", Gender.MALE, LocalDate.of(1971,
	    	        Month.JANUARY, 1), 2343.0);
	    	    Employee p2 = new Employee(2, "Jack", Gender.MALE, LocalDate.of(1972,
	    	        Month.JULY, 21), 7100.0);
	    	    Employee p3 = new Employee(3, "Jane", Gender.FEMALE, LocalDate.of(1973,
	    	        Month.MAY, 29), 5455.0);
	    	    Employee p4 = new Employee(4, "Jode", Gender.MALE, LocalDate.of(1974,
	    	        Month.OCTOBER, 16), 1800.0);
	    	    Employee p5 = new Employee(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,
	    	        Month.DECEMBER, 13), 1234.0);
	    	    Employee p6 = new Employee(6, "Jason", Gender.MALE, LocalDate.of(1976,
	    	        Month.JUNE, 9), 3211.0);

	    	    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

	    	    return persons;
	    	  }

	    	  @Override
	    	  public String toString() {
	    	    String str = String.format("(%s, %s,  %s,  %s,  %.2f)\n", id, name, gender,
	    	        dob, income);
	    	    return str;
	    	  }
	    	}
	}