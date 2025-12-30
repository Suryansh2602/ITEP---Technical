// WAP to remove the duplicate letters from given String.
// class RemoveRepeatedValues {
//     private String uniqString = " ";

//     public RemoveRepeatedValues(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             char current = str.charAt(i);
//             if (uniqString.indexOf(current) == -1) {
//                 uniqString += current;
//             }
//         }
//     }

//     public String getUniqueString() {
//         return uniqString;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         String s = "aabbccddd";
//         RemoveRepeatedValues str = new RemoveRepeatedValues(s);
//         System.out.println("Original String : " + s);
//         System.out.println("Unique String : " + str.getUniqueString()); // Output: abcd
//     }
// }

import java.util.Scanner;

class RemoveDuplicates {

    private String result;

    public String Remove(String str) {
        String result = "";

        char ch[] = str.toCharArray();
        char current = '\0';
        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] == ch[i]) {
                    isDuplicate = true;
                }

            }
            if (!isDuplicate) {
                result += ch[i];
            }

        }
        return result;
    }

    public String Removef(String str) {
        String result = "";
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }

        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        RemoveDuplicates st = new RemoveDuplicates();
        String res = st.Removef(str);
        System.out.println(res);

    }
}
