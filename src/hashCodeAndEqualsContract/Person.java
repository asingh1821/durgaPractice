package hashCodeAndEqualsContract;

import java.util.Objects;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Person person = (Person)o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(age,name);
    }
}
