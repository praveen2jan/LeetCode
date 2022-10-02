package Easy;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
                count++;
            } else {
                set.add(c);
            }
        }

        return set.isEmpty() ? count *2 : count*2+1;
    }
}
