//  Write a Java program to get the character at the given index within the String

import java.lang.String;

class ChatIndex {
    private String str;
    private int index;

    public ChatIndex(String str, int index) {
        this.str = str;
        this.index = index;
    }

    public char getChar() {
        char ch[] = str.toCharArray();
        if (index < ch.length) {
            return ch[index];

        }
        return '\0';
    }
}

class Main {
    public static void main(String[] args) {
        String str = "Hello world!";
        ChatIndex ch = new ChatIndex(str, 7);
        char res = ch.getChar();
        if (res != '\0') {
            System.out.println(res);
        }

    }
}