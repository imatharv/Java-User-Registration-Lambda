package JUnit;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ValidateWithLambdaExpression {
	public static void main(String[] args) {
		//First name validation
		//Input list
		List<String> name = Arrays.asList("Atharva", "Gaurav", "piyush","ChaiTanya");
		Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	
		//Compile regex as predicate and apply predicate filter
		List<String> res = name.stream().filter(pattern1.asPredicate()).collect(Collectors.<String>toList());
	
		//Using regex with lambda expression
		List<String> res1 = name.stream().filter(p -> pattern1.matcher(p).find()).collect(Collectors.<String>toList());
	
		//Using regex with predicate functional interface
		List<String> res2 = name.stream().filter(new Predicate<String>() {
			public boolean test(String s) {
				return pattern1.matcher(s).find();
			}
		}).collect(Collectors.<String>toList());
	
		//For printing the result
		res.forEach(System.out::println);
		res1.forEach(System.out::println);
		res2.forEach(System.out::println);
	
		System.out.println("------------------------------------------");	
		
		//Last name validation
		List<String> lastname = Arrays.asList("Joshi", "Mhatre", "TriVedi","sHARMA");
		Pattern pattern2 = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		//Using lambda expression
		List<String> output = lastname.stream().filter(p -> pattern2.matcher(p).find())
							.collect(Collectors.<String>toList());
		//Printing result
		output.forEach(System.out::println);
	
		System.out.println("------------------------------------------");
	
		//Email validation
		List<String> emails = Arrays.asList("abc@yahoo.com", "abc.100@yahoo.com", "abc123@.com.com","abc@abc@gmail.com");
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
	
		// Compile regex as predicate and apply predicate filter
		List<String> result = emails.stream().filter(pattern.asPredicate()).collect(Collectors.<String>toList());
	
		//Using regex with lambda expression
		List<String> result1 = emails.stream().filter(p -> pattern.matcher(p).find())
							.collect(Collectors.<String>toList());
	
		//Using regex with predicate functional interface
		List<String> result2 = emails.stream().filter(new Predicate<String>() {
			public boolean test(String s) {
				return pattern.matcher(s).find();
			}
		}).collect(Collectors.<String>toList());
	
		// Now printing the result
		result.forEach(System.out::println);
		result1.forEach(System.out::println);
		result2.forEach(System.out::println);
	
		System.out.println("------------------------------------------");
	
		//Mobile number validation
		//Input list
		List<String> mobileNumber = Arrays.asList("+91 9665654666", "91 9665654666", "919665654666","+919665654666");
		Pattern pattern3 = Pattern.compile("^[+]{0,1}[0-9]{2,3}[: :][7-9]{1}[0-9]{9}$");
		//Using lambda expression
		List<String> output1 = mobileNumber.stream().filter(p -> pattern3.matcher(p).find()).collect(Collectors.<String>toList());
		//Printing result
		output1.forEach(System.out::println);
	
		System.out.println("------------------------------------------");
		
		//Password validation
		//Input list
		List<String> password = Arrays.asList("Atharva@3kjsgk", "atharvaP@123", "atharva@1","Ath@12");
		Pattern pattern5 = Pattern.compile("^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$");
		//Using lambda expression
		List<String> output3 = password.stream().filter(p -> pattern5.matcher(p).find()).collect(Collectors.<String>toList());
		//Printing result
		output3.forEach(System.out::println);
		
	}
}

