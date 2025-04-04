import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumMeeting {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7,9,9};
        Solution s = new Solution();
        int val = s.activitySelection(start, finish);
        System.out.println(val);

    }
}
class Solution {
    public static int activitySelection(int[] start, int[] finish) {
        List<List<Integer>> lol = new ArrayList<>();
        int i = 0 , j = 0;
        while(i < start.length && j < finish.length){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(start[i]);
            list.add(finish[j]);
            lol.add(list);
            i++; j++;
        }
        System.out.println(lol);
        int res = findCount(lol);
        return res;
    }
    public static int findCount(List<List<Integer>> lol) {
        Collections.sort(lol,(a, b)-> a.get(1)-b.get(1));
        System.out.println(lol);
        List<Integer> s = lol.get(0);
        int st = s.get(0);
        int end = s.get(1);
        int count = 1;
        for(int k = 1; k < lol.size(); k++){
            List<Integer> curr = lol.get(k);
            if(end <= curr.get(0)){
                count++;
                end = Math.max(end,curr.get(1));
            }else{
                //end = curr.get(1);
                st = curr.get(0);
            }
        }
        return count;
    }
}