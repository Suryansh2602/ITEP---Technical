//  3. String Problem #1

// Find First Non-Repeating Character

// Write a program that takes a string input and returns the first character that does not repeat.

// If all characters repeat, return "None".

// Example:

// Input: "swiss" → Output: "w"

// Input: "aabbcc" → Output: "None"

class NonRepeating {
    String input;

    public NonRepeating(String input) {
        this.input = input;
    }

    public char checkNonRepeating() {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean repeated = false;
            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(j) == c) {
                    repeated = true;
                    break;
                }
            }

            // If not repeated, return this character
            if (!repeated) {
                return c;
            }
        }
        // Return null char if none found
        return '\0';
    }
}

class Main {
    public static void main(String[] args) {
        String input = "swiss";
        NonRepeating ch = new NonRepeating(input);
        char c = ch.checkNonRepeating();

        if (c != '\0')
            System.out.println("The First non repeating value is : " + c);
        else
            System.out.println("None");
    }
}
