import java.util.*;

public class PalindromeProgram {
    public static void main(String[] args) {
        String s = "a bb,a";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != ' ' && c != ','){
                sb.append(c);
            }
        }
        boolean res = isPalindrome(sb);
        System.out.println("string s is palindrome : "+ res);
    }
    public static boolean isPalindrome(StringBuilder sb) {
        int j = 0, k = sb.length()-1;
        while(j <= k) {
            char c1 = sb.charAt(j);
            char c2 = sb.charAt(k);
            if (c1 == c2) {
                j++;
                k--;
            } else {
                return false;
            }

        }
        return  true;
    }
}
