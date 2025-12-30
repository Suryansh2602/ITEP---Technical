// WAP to find out total occurrence of each letter in string.
// // 	 Sample Input: “aabbccddd”
// // 	 Output:    a- 2 times
// // 		        	b- 2 times
// // 			        c- 2 times
// // 			        d- 3 times

// 7)WAP to remove the duplicate letters from given String.
// 	Sample Input: “aabbccddd”
// 	Output: “abcd”
import java.util.Scanner;

class RemoveDuplicate {
    private String result = "";

    public String remove(String str) {
        char[] ch = str.toCharArray();
        int n = ch.length;
        int count;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) {
                result += ch[i];
            }
        }
        return result;
    }

    public String removef(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
                break;
            }

        }
        return result;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter a string  to cheack duplicate ");
        String str = se.next();
        RemoveDuplicate r1 = new RemoveDuplicate();
        System.out.println(r1.removef(str));
    }
}
