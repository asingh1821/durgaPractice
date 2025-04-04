package array2d;

public class SearchTargetNumberUsingByConverting2DArrayToFlatArray {

    public static void main(String[] args) {
        int[][] grid = {{3,4,7,9},{12,13,16,19},{20,21,23,29}};
        int target = 3;
        boolean isPresent = isTargetPresent(grid, target);
        System.out.println("the target number is present : "+ isPresent);
    }
    public static boolean isTargetPresent(int[][] grid, int target) {
        int lengthOfArray = grid.length * grid[0].length ;
        int low = 0, high = lengthOfArray - 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            int row = mid / grid[0].length, column = mid % grid[0].length;
            if(grid[row][column] == target ) {
                return true;
            }else if(grid[row][column] < target) {
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}
