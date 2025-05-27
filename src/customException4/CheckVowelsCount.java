package customException4;
import Exception.NoVowelsPresentException;
public class CheckVowelsCount {
    public void  checkVowel(String text) throws NoVowelsPresentException {
        boolean b = false;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(vowels.contains(String.valueOf(c))){
                b = true;
                break;
            }
        }
        if(!b){
            throw new NoVowelsPresentException(
                    "No vowels are present in the given text");
        }else {
            System.out.println("vowels are present in the text ");
        }
    }
}
