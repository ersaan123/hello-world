
package com.example;

import static org.junit.Assert.*;

import org.junit.Test;



public class PalindromeTest{


@Test
// Driver code
public void checkstr()
{
    Palindrome palindromeTester = new Palindrome();
    assertTrue(palindromeTester.isWordPresent(" hello world ","hello"));
	
	

}

    @Test
    public void testWordNotInString() {
        String sentence = "hello world";
        assertFalse(sentence.contains("cat"));
    }
@Test
    public void testWordInEmptyString() {
        String sentence = "";
        assertFalse(sentence.contains("hello"));
    }
}
