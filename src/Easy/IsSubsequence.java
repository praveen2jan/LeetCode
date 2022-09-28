package Easy;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    private static boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int sIndex = 0;
        int tIndex = 0;
        while(tIndex < t.length()) {
            if(t.charAt(tIndex) == s.charAt(sIndex))
                sIndex++;
            if(sIndex == s.length())
                return true;
            tIndex++;
        }
        return false;
    }
}
