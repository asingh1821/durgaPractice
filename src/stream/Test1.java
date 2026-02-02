package stream;

public class Test1 {
    public static void main(String[] args) {
//       //Please write a program to check if the strings are anagram
//       Or not “SILENT” & “LISTEN”
        String s1 = "SILENT";
        String s2 = "LISTEN";
        boolean result = checkAnagram(s1,s2);
        System.out.println(result);
    }
         public static boolean checkAnagram(String s1, String s2){
             if(s1.length() != s2.length()){
                 return false;
             }
             int[] arr = new int[256];
             for(int i = 0; i < s1.length(); i++) {
                 char cs1 = s1.charAt(i);
                 char cs2 = s2.charAt(i);
                 arr[cs1-'0']++;
                 arr[cs2-'0']--;
             }
             for(int num : arr) {
                 if (num != 0) {
                     return false;
                 }
             }
             return true;
        }
}

