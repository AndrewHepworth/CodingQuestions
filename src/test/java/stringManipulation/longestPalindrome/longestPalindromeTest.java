package stringManipulation.longestPalindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class longestPalindromeTest {

    @Test
    @DisplayName("givenSubArray")
    void givenSubArray() {
        assertEquals("andrew".substring(1,2), "n");
    }

    @Test
    @DisplayName("should be reversed")
    void shouldBeReversed() {

        assertEquals(longestPalindrome.reverse("abc"), "cba");
        assertEquals(longestPalindrome.reverse("aba"), "aba");
        assertEquals(longestPalindrome.reverse("aaaabbaa"), "aabbaaaa");
    }


    @Test
    @DisplayName("given that the input is ")
    void givenThatTheInputIs() {
     assertEquals(longestPalindrome.findLongestPalindrome("aaaabbaa"),"aabbaa");
    }

    @Test
    @DisplayName("should return aabbaa")
    void shouldReturnAabbaa() {
        longestPalindrome.main(new String[]{ "1", "aaaabbaa"});
    }}
