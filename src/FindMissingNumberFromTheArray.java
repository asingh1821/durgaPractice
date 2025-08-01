public class FindMissingNumberFromTheArray {

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,7,3,8};
        int res = findMissingNumber(arr);
        System.out.print("Missing number is: " + res);
    }
    public static int findMissingNumber(int[] arr){
        int[] number = new int[9];

        for(int i = 0; i < arr.length; i++){
            number[arr[i]] = 1;
        }
        for(int j = 1; j <= number.length; j++){
            if(number[j] != 1){
                return j;
            }
        }
        return 0;
    }
}
