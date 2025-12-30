//Write a java program to find all possible palindrom of given String.
	

class Palindrome {
    
    // Function to check if a string is palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void findPalindromes(String str) {
        int n = str.length();

        System.out.println("All Palindromic Substrings:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                if (sub.length() > 1 && isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "aaabbbacccababacccaabb";
        System.out.println("Input String: " + input);
        findPalindromes(input);
    }
}
