// WAP to count the word whose first letter is  vowel.
import java.lang.String;
class Main{
    public static void main(String[] args) {
        String str = "Hello Student, the University of Los Angeles invites you to this event";
        String vowel = "AEIOUaeiou";
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (i==0||str.charAt(i-1)==' '&& str.charAt(i+1)!=' ') {
                if(vowel.indexOf(str.charAt(i))!=-1){
                    count++;
                }
                
            }
        }
        System.out.println(count);
        
                    
    }                
}
            
        