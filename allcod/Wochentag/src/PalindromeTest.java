import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test() {
		assertTrue(Palindrome.isPalindrome(new char[] {}));
		assertTrue(Palindrome.isPalindrome(new char[] {'a'}));
		assertTrue(Palindrome.isPalindrome(new char[] {'a', 'a'}));
		assertFalse(Palindrome.isPalindrome(new char[] {'a', 'b'}));
		assertTrue(Palindrome.isPalindrome(new char[] {'A', 'N', 'N', 'A'}));
		assertFalse(Palindrome.isPalindrome(new char[] {'a', 'a', 'b', 'a'}));
		assertTrue(Palindrome.isPalindrome(new char[] {'l', 'e', 'g', 'o', 'v', 'o', 'g', 'e', 'l'}));
		assertTrue(Palindrome.isPalindrome(new char[] {'L', 'e', 'g', 'o', 'V', 'o', 'G', 'e', 'l'}));
	
	}

}
