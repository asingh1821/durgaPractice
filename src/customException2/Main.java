package customException2;

import Exception.AgeNotValidException;

public class Main {

    public static void main(String[] args)  {
        Voting voting = new Voting();
        try{
            voting.ageCheck(12);
        }catch(AgeNotValidException a){
            System.out.println(a.getMessage());
        }
    }
}
