public class printNto1UsingRecursion {

    static int count = 1;
    public static void main(String[] args) {
        int n = 15;

        printNto1Number(n);
        System.out.println(" ");
        print1ToNnumber(n);
        System.out.println(" ");
        printAnother1ToN(n,count);
    }
    public static void printNto1Number(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1Number(n - 1);
    }
    public static void print1ToNnumber(int n){
        if(n == 0){
            return ;
        }
        print1ToNnumber(n-1);
        System.out.print(n + " ");

    }

    public static void printAnother1ToN(int n, int count){
        if(n == 0){
            return ;
        }
        System.out.print(count + " ");
        printAnother1ToN(n-1,count+1);
    }
}
