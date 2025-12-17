package OopsPractice.second;

public class GymMembership {
    private String name;
    private String membershipType;
    private int duration;

    GymMembership(String name, String membershipType, int duration){
        this.name = name;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public String getName(){
        return name;
    }
    public String getMembershipType(){
        return membershipType;
    }
    public int getDuration(){
        return duration;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMembershipType(String membershipType){
        this.membershipType = membershipType;
    }
    public void ssetDuration(int duration){
        this.duration = duration;
    }
    public double calculateFees(){
        double baseFee = 100;
        return baseFee*duration;
    }
    public String checkSpecialOffers(){
        if(membershipType.equalsIgnoreCase("annual")){
            return "10% discount for Annual membership";
        }else{
            return "No special offers";
        }
    }
    public void displayDetails(){
        System.out.println("member name : "+ name);
        System.out.println("membership type : "+ membershipType);
        System.out.println("calculate fees : "+ calculateFees());
        System.out.println("duration : "+ duration);
        System.out.println("offer : "+ checkSpecialOffers());
        System.out.println("------------------------------------");
    }

}
