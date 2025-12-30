// )WAP check if two Strings are anagrams of each other?
// // (Hint Anagram words: LISTEN - SILENT 
// // 				  TRIANGLE - INTEGRAL)

class Anagrams {
    private String str1;
    private String str2;

    public Anagrams(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String checkAnagrams() {
        if (str1.length() != str2.length()) {
            return "not Anagrams";
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;

        }
        for (int i : count) {
            if (i != 0) {
                return "Not anagrams";
            }

        }
        return "Anagrams";

    }
}

class Main {
    public static void main(String[] args) {

        String str1 = "LISTEN";
        String str2 = "SILENT";
        Anagrams ag = new Anagrams(str1, str2);
        System.out.println(ag.checkAnagrams());

    }
}