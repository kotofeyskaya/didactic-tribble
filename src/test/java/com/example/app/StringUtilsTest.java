package com.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void testReverseNull() {
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"));
    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testCountWords() {
        assertEquals(3, stringUtils.countWords("hello world foo"));
    }

    @Test
    void testCountWordsBlank() {
        assertEquals(0, stringUtils.countWords("   "));
    }

    @Test
    void testIsPalindromeNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> stringUtils.isPalindrome(null));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testCountWordsNull() {
        assertEquals(0, stringUtils.countWords(null));
    }

    @Test
    void testIsPalindromeCaseInsensitive() {
        assertTrue(stringUtils.isPalindrome("Racecar"));
    }
}
