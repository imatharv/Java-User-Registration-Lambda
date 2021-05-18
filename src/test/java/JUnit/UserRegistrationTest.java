package JUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	
	@Test
	public void testfirstName_shouldReturnTrue() throws InvalidDetailException {
		String firstName = "Atharva";
		boolean isValidFirstName = UserRegistration.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}

	@Test
	public void testfirstName_shouldReturnFalse() throws InvalidDetailException {
		String firstName = "athArva";
		boolean isValidFirstName = UserRegistration.isValidFirstName(firstName);
		assertFalse(isValidFirstName);
	}

	@Test
	public void testlastName_shouldReturnTrue() throws InvalidDetailException {
		String lastName = "Joshi";
		boolean isValidLastName = UserRegistration.isValidLastName(lastName);
		assertTrue(isValidLastName);
	}

	@Test
	public void testlastName_shouldReturnFalse() throws InvalidDetailException {
		String lastName = "JoShi";
		boolean isValidLastName = UserRegistration.isValidLastName(lastName);
		assertFalse(isValidLastName);
	}

	@Test
	public void testmobileNumber_shouldReturnTrue() throws InvalidDetailException {
		String mobileno = "91 9665654666";
		boolean isValidMobileNo = UserRegistration.isValidMobileNo(mobileno);
		assertTrue(isValidMobileNo);
	}

	@Test
	public void testmobileNumber_shouldReturnFalse() throws InvalidDetailException {
		String mobileno = "9665654666";
		boolean isValidMobileNo = UserRegistration.isValidMobileNo(mobileno);
		assertFalse(isValidMobileNo);
	}

	@Test
	public void testemail_shouldReturnTrue() throws InvalidDetailException {
		String email = "joshicarrier@gmail.com";
		boolean isValidEmailId = UserRegistration.isValidEmailId(email);
		assertTrue(isValidEmailId);
	}

	@Test
	public void testemail_shouldReturnFalse() throws InvalidDetailException {
		String email = "#joshi#@carrier@gmail.com";
		boolean isValidEmailId = UserRegistration.isValidEmailId(email);
		assertFalse(isValidEmailId);
	}

	@Test
	public void testpassword_shouldReturnTrue() throws InvalidDetailException {
		String password = "Asdfgh21#";
		boolean isValidPassword = UserRegistration.isValidPassword(password);
		assertTrue(isValidPassword);
	}

	@Test
	public void testpassword_shouldReturnFlase() throws InvalidDetailException {
		String password = "Jc2021";
		boolean isValidPassword = UserRegistration.isValidPassword(password);
		assertFalse(isValidPassword);
	}	
}
