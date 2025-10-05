import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("a1.txt");
            String data = "";
            while (true) {
                int x = fin.read();
                if (x == -1)
                    break;
                data = data + (char) x;
            }
            System.out.println(data);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}