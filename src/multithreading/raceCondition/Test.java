package multithreading.raceCondition;

class RaceCondition {
    int count = 0;
    public int increaseCount(){
        count++;
        return count;
    }
}
public class Test{
    public static void main(String[] args) {

    }
}

