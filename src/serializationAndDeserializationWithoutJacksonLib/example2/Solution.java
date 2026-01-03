package serializationAndDeserializationWithoutJacksonLib.example2;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Student st = new Student("Amit", 28);
        String fileName = "Gipgr.txt";

//      serialization
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            fos.close();
            oos.close();
            System.out.println("Object is serialized");
        }catch(IOException e){
            System.out.println("exception caught");
        }


//      deserialization
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Object deserialized.....");
            System.out.println("name: "+ s.getName());
            System.out.println("age: " + s.getAge());
        }catch(IOException e) {
            System.out.println("exception caught.........");
        }catch (ClassNotFoundException e1) {
            System.out.println("Class not found exception exists");
        }


    }
}
