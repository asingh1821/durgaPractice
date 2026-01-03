package serializationAndDeserializationWithoutJacksonLib.exampleUsingTransientStatic;

import java.io.Serializable;

public class School implements Serializable {
    transient int rooms;
    static int teacher;
    String name;
    int students;

    public School(String name, int student, int rooms, int teacher){
        this.name = name;
        this.students = students;
        this.rooms = rooms;
        this.teacher = teacher;
    }
}
