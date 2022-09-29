package Easy;

import static Easy.ReverseString.reverseString;

public class ReverseWordsInaStringIII {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String reverseString = reverseWords(s);

        System.out.println(reverseString);
    }

    private static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] words = s.split(" ");
        for(int i =0;i<words.length;i++){
            char[] chars = words[i].toCharArray();
            reverseString(chars);
            builder.append(chars);
            if(i!=words.length-1)
                builder.append(" ");
        }
        return builder.toString();
    }
}
