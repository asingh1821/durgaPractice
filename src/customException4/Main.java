package customException4;
import Exception.NoVowelsPresentException;
public class Main {
    public static void main(String[] args) {
        CheckVowelsCount ch = new CheckVowelsCount();
        try{
            String text = "bbb ccc fdd fff ggg ";
            System.out.println(text);
            ch.checkVowel(text);
        }catch(NoVowelsPresentException e){
            System.out.println(e.getMessage());
        }
    }
}
