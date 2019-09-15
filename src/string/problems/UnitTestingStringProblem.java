package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnitTestingStringProblem {

        //Apply Unit Test into all the methods in this package.

        Anagram anagram = new Anagram();
        Permutation permutation = new Permutation();
//      private DuplicateWord dup = new DuplicateWord();
        DetermineLargestWord large = new DetermineLargestWord();
        String wordPalindrome = "";
        Palindrome palindrome = new Palindrome();
        boolean eResult, aResult;


        @Test
        public void testPalindrome() {
            wordPalindrome ="madam";
            eResult=true;
            aResult = palindrome.isPalindrome(wordPalindrome);
            Assert.assertEquals(aResult, eResult);
        }
        @Test
    public void testPermutation() {

        }



    }
