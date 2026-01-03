package serializationAndDeserializationWithoutJacksonLib.exampleUsingTransientStatic;

import java.io.*;

public class Sol {
    public static void main(String[] args) {
        School school = new School("JNV", 350, 20, 25);
        printData(school);
        String fileName = "School.txt";

//      serialization
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(school);
            oos.close();
            fos.close();
            System.out.println("Serialization completed....");
//            printData(school);
        }catch(IOException e){
            System.out.println("exception caught....");
        }

//        Deserialization
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            School sch = (School) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserilaztion completed...");
            printData(sch);
        }catch(IOException e){
            System.out.println("exception caught1111....");
        }catch(ClassNotFoundException e1){
            System.out.println("class not found exception ");
        }
    }
    public static void printData(School sc) {
        System.out.println("name: "+ sc.name);
        System.out.println("no. of Students: " + sc.students);
        System.out.println("no. of rooms: " + sc.rooms);
        System.out.println("no. of teachers: "+ School.teacher);
    }
}
