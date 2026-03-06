package serializationAndDeserializationWithoutJacksonLib.example3;

import serializationAndDeserializationWithoutJacksonLib.example1.Employee;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 1);
        String file = "filname.exe";
        //Serialization
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            fos.close();
            oos.close();
            System.out.println(s1.toString());
            System.out.println("object serialized....");
        }catch (IOException e){
            System.out.println("exceptions handled");
            e.printStackTrace();
        }
        // Deserialization
        Student student = null;
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            student = (Student) ois.readObject();
            System.out.println("object is deserialized.......");
            System.out.println(student.toString());
            fis.close();
            ois.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("IOException is caught");
        }catch (ClassNotFoundException e) {
            System.out.println("class not found exceptions....");
        }
    }
}
