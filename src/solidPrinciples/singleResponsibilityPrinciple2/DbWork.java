package solidPrinciples.singleResponsibilityPrinciple2;

import java.io.FileWriter;
import java.io.IOException;

public class DbWork {

    private User user;

    public DbWork(User user){
        this.user = user;
    }

    public void saveToDb(User user){
        try(FileWriter fileWriter = new FileWriter(user.getName()+  " .txt")){
            fileWriter.write("Name: " +  user.getName() + "\n ");
            fileWriter.write("Email: " + user.getEmail() + "\n");
            System.out.println("User data saved successfully");
        }catch(IOException e){
           e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Amit","amtsingh@gmail.com");
        DbWork d = new DbWork(user1);
        d.saveToDb(user1);
    }
}
