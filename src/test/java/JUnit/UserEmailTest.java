package JUnit;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//parameterized test 
@RunWith(Parameterized.class)
public class UserEmailTest {
    private String emailId;
    private Boolean expectedResult;
    
    public UserEmailTest(String emailId, Boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

	@Parameterized.Parameters
    public static Collection<Object[]> emails() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc+100@gmail.com", true},
                {"abc@gmail.com.com", false},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }
	
	@Test
	public void testEmail_ShouldReturnExpected() {
		boolean isValidEmail = UserRegistration.isValidEmailId(emailId);
		assertEquals(expectedResult, isValidEmail);
	}
}