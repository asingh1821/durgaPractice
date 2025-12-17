package OopsPractice.second;

class PremiumMembership extends GymMembership{

    private boolean personalTrainer;
    private boolean spaAccess;

    PremiumMembership(String name, String membershipType, int duration, boolean personalTrainer, boolean spaAccess){
        super(name,  membershipType, duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }
    public void setPersonalTrainer(boolean personalTrainer){
        this.personalTrainer = personalTrainer;
    }
    public boolean getPersonalTrainer(){
        return personalTrainer;
    }
    public void setSpaAccess(boolean spaAccess){
        this.spaAccess = spaAccess;
    }
    public boolean getSpaAccess(){
        return spaAccess;
    }
    @Override
    public double calculateFees(){
        double baseFees = super.calculateFees();
        double additionalFees = 0.0;
        if(personalTrainer == true){
            additionalFees += 50;
        }
        if(spaAccess == true){
            additionalFees += 30;
        }
        return baseFees+additionalFees;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("personalTrainer : "+ getPersonalTrainer());
        System.out.println("spa Access : "+ getSpaAccess());
    }

}
