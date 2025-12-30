// Find the first repeating element in array of integersc
class FirstRepeatingElement {
    private int arr[] = { 1, 2, 3, 4, 2, 4, 5, 2 };
    // private boolean checked[] = new boolean[arr.length];

    public int getRepeat() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (this.arr[i] == this.arr[j])
                    return arr[i];
            }
        }
        return 0;
    }
}

class Test {
    public static void main(String[] args) {
        FirstRepeatingElement f1 = new FirstRepeatingElement();
        System.out.println(f1.getRepeat());
    }
}