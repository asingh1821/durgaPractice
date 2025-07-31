package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction{
    private String date;
    private int amount;

    public Transaction(String date, int amount){
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}


public class SumOftransactionAmountEachDay {

    public static void main(String[] args) {
        List<Transaction> loT = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String,Integer> countOfTrans = loT.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                        Collectors.summingInt(Transaction::getAmount)));

        countOfTrans.forEach((k,v)-> System.out.println("date " + k+ "no of transaction "+ v));
    }
}
