package OopsPractice.second;

public class Main {

    public static void main(String[] args) {
        GymMembership gm = new GymMembership("Amit","quarter",10);
        System.out.println("basic membership");
        gm.displayDetails();
        PremiumMembership pm = new PremiumMembership("Aman","annual",12,true,true);
        System.out.println("premium membership ");
        pm.displayDetails();
    }
}
