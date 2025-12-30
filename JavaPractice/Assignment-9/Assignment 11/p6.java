// reverse methods of string without using inbuilt methods

class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = "";

        // build reversed string manually
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
    }
}
