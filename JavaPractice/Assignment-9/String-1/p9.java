// WAP to find out total occurrence of each letter in string.
// 	 Sample Input: aabbccddd
// 	 Output:    a- 2 times
// 		        	b- 2 times
// 			        c- 2 times
// 			        d- 3 times

class Occurrence {
    // public String input;

    public void Count(String str) {
        boolean b[] = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            continue;
            b[i] = true;
        }
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }

        }
    }
}

class Main {
    public static void main(String[] args) {
        String str = "aabbccddd";
        Occurrence oc = new Occurrence();
        oc.Count(str);

    }
}