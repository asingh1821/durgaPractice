package serializationAndDeserializationWithoutJacksonLib.example3;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public String toString(){
        return "Student name: "+ name+ " roll No.  "+ roll;
    }
}

