public class CheckPalindromeNumberWithoutString {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int revNum = 0;
        int rem = 0;
        while (temp > 0) {
            rem = temp % 10;
            temp = temp / 10;
            revNum = revNum * 10 + rem;
        }
        if (revNum == num) {
            System.out.println("Palindrome no. ");
        } else {
            System.out.println("not a palindrome no. ");
        }
    }
}
