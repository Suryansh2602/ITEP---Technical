//lenght method of string without using inbuilt methods
class p8 {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = 0;

        // Calculate length manually
        for (int i = 0; i < str.length(); i++) {
            length++;
        }

        System.out.println("Original String: " + str);
        System.out.println("Length of the string: " + length);
    }
    
}
