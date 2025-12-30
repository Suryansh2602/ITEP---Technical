//equals method of string without using inbuilt methods
class p7 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = true;

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            areEqual = false;
        } else {
            // Compare each character
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Are the strings equal? " + areEqual);
    }
    
}
