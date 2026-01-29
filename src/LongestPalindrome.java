public class LongestPalindrome {
    /**
     * Given a string , return longest palindrom string .
     * <p>
     * Ex : Input x = "babcda"
     * output "bab"
     * <p>
     * Input x = "cbbd"
     * output : "bb"
     *
     * @return
     */
    public static void main(String[] args) {
        String x = "cbbd";
        int left = 0, right = 0;

        for (int i = 0; i < x.length(); i++) {
            int len1 = check(x, i, i);
            int len2 = check(x, i, i + 1);   // "babcda"
            int maxLen = Math.max(len1, len2);
            if (maxLen > right-left) {
                left = i -(maxLen-1)/2;
                right = i + maxLen/2;
            }
        }
        String longPalindrome = x.substring(left,right);
        System.out.println("longest palindrome : "+ longPalindrome);
    }
    public static int check(String x, int left, int right){
        while (left >= 0 && right < x.length()-1
                && x.charAt(left) == x.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
