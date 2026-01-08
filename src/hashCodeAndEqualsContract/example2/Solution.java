package hashCodeAndEqualsContract.example2;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Amit",1000);
        Employee emp2 = new Employee("Amit",4000);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Amit",1000);
        map.put("Aman",2000);
        map.put("Ankit",3000);
        map.put("Amit",2000);
        System.out.println("size of map is : "+ map.size());

        if(emp1.hashCode() == emp2.hashCode()){
            System.out.println("both objects have same hashcode");
        }else{
            System.out.println("not same hashcode");
        }

    }
}
