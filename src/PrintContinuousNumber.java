import java.util.ArrayList;
import java.util.List;

public class PrintContinuousNumber {
    public static void main(String[] args) {
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            num = num * 10 + (i+1);
            list.add(num);
        }
        System.out.println(list+" ");
    }
}
