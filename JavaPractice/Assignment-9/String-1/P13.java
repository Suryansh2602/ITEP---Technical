//  Input data exactly in the following format, and print sum of all integer values.
// 	Sample Input: 67, 89, 23, 67, 12, 55, 66. (Hint use String class split method and Integer class parseInt method)

class Arr {
    String arr[];
    int sum;

    public Arr(String str) {
        this.arr = str.split(", ");

    }

    public int summation() {

        int sum = 0;
        for (String i : arr) {
            sum += Integer.parseInt(i);

        }
        return sum;
    }
}

class Main {
    public static void main(String... args) {
        String s = "67, 89, 23, 67, 12, 55, 66";
        Arr ar = new Arr(s);
        int res = ar.summation();
        System.out.println("original is: " + s);
        System.out.println("Sum is " + res);
    }

}