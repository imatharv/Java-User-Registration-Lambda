package JUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    
    public static boolean isValidFirstName(String firstName) throws InvalidDetailException {
		final String regex = "^[A-Z]{1}[a-z]{2,}";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = "";

		try {
			Matcher matcher = pattern.matcher(firstName);
			match = matcher.matches();
			if(!match) {
				message = firstName+" is an invalid first name";
				throw new InvalidDetailException(message);
			}
		}
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
	}
	public static boolean isValidLastName(String lastName) {
		final String regex = "^[A-Z]{1}[a-z]{2,}";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
			Matcher matcher = pattern.matcher(lastName);
			match = matcher.matches();
			if(!match) {
				message = lastName + " is an invalid last name";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
	}
	public static boolean isValidMobileNo(String mobileNo) {
		final String regex = "^[+]{0,1}[0-9]{2,3}[: :][7-9]{1}[0-9]{9}$";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
			Matcher matcher = pattern.matcher(mobileNo);
			match = matcher.matches();
			if(!match) {
				message = mobileNo + " is an invalid mobile number";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
	}
	public static boolean isValidEmailId(String email) {
		final String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
			Matcher matcher = pattern.matcher(email);
			match = matcher.matches();
			if(!match) {
				message = email + " is an invalid email id";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
	}
	public static boolean isValidPassword(String password) {
		final String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		final Pattern pattern = Pattern.compile(regex);
		boolean match = false;
		String message = " ";
		try {
			Matcher matcher = pattern.matcher(password);
			match = matcher.matches();
			if(!match) {
				message = password + " is an invalid password";
				throw new InvalidDetailException(message);
			}
		}	
		catch(InvalidDetailException e) {
			System.out.println(e);
		}
		return match;
	}
}
