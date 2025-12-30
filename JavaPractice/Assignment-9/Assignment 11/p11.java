//reverse the word of the String
class Reverse {
    private String str;
    private String rev = "";

    public Reverse(String str) {
        this.str = str;
        String word = "";

      
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                rev += reverseWord(word) + " ";
                word = ""; 
            } else {
                word += ch; 
            }
        }

        
        rev += reverseWord(word);
    }


    private String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public void revString() {
        System.out.println(rev);
    }
}

class Main {
    public static void main(String args[]) {
        String str = "Java is platform Independent";
        Reverse r = new Reverse(str);
        r.revString();
    }
}
