package serializationAndDeserializationWithoutJacksonLib.example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Solution {
    public static void main(String[] args) {
        Student st = new Student("Amit", 28);
        String fileName = "Gipgr.txt";
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            fos.close();
        }catch(IOException e){

        }
    }
}
