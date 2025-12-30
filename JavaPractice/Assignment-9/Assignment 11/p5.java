//contains methods of string without using inbuilt methods

class MiniString {
    private String str;

    // Constructor to initialize the string
    public MiniString(String x) {
        this.str = x;
    }

    // Method to find the index of a character in the string
    public int findIndexOf(char a) {
        int counter = 0;
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) == a) {
                return counter; // Return the index if found
            }
            counter++;
        }
        return -1; // Return -1 if character not found
    }
}
class Main {
    public static void main(String[] args) {
        MiniString miniString = new MiniString("Hello World");
        int index = miniString.findIndexOf('o');
        System.out.println("Index of 'o': " + index);
    }
}
