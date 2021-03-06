package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseAString {

    /**
     * Reverse A String
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with 0(1) extra memory
     *
     * You may assume all the characters consist of printable ascii characters.
     *
     * Example 1:
     * Input: ["h", "e", "l", "l", "o"]
     * Output: ["o", "l", "l", "e", "h"]
     *
     *
     * Example 2:
     * Input: ["H", "a", "n", "n", "a", "h"]
     * Output: ["h", "a", "n", "n", "a", "h"]
     *
     * Method with two pointers moving in different directions:
     */

    public void reverseString(char[] s){
        int start = 0;
        int end = s.length - 1;

        //start pointer moves forward in the array and the end pointer moves backwards,
        //uses a temp char placeholder to not write over anything
        //flips values until the start pointer and the end pointer converge, at which point the program ends
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * When given a String, reverse it. Return the reversed string.
     */

    public String reverseStringByLoop(String str){
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revStr = str;
        }
        return revStr;
    }


    public String reverseStringIter(String str){
        String revStr = "";

        while(revStr.length() <= str.length()){

            for(int i = str.length() - 1; i >= 0; i--){
                revStr = str;
            }
        }
        return revStr;
    }


}
