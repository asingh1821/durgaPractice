package customException2;

import Exception.AgeNotValidException;

public class Voting {

    public void ageCheck(int age) throws AgeNotValidException {

        if(age < 18){
            throw new AgeNotValidException("You can not vote : you are under age");
        }else{
            System.out.println("Please cast your vote");
        }
    }
}
