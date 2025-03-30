import java.util.HashMap;
import java.util.Map;

public class Check {
    public static void main(String[] args) {
            System.out.println("Hello World");
            int[] arr = {1,2,3,1,1,1,2,2,5,8,0,0,8};
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int n : arr) {
                map.put(n, map.getOrDefault(n,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();
                System.out.println("key "+ key + "  value " + value);
            }
        }
    }
