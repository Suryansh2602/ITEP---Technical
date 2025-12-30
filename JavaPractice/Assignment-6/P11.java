// Write a program to cyclically rotate array by one.

class Rotate {
    int arr[];

    public Rotate(int arr[]) {
        this.arr = arr;
        System.out.println("Original Array : ");
        for (int i : this.arr) {
            System.out.print(i + " \t");
        }
        int a = arr[this.arr.length - 1];
        for (int i = this.arr.length - 1; i > 0; i--) {
            this.arr[i] = this.arr[i - 1];
        }
        arr[0] = a;

    }

    public void getArray() {
        System.out.println("\nRotated Array : ");
        for (int i : this.arr) {
            System.out.print(i + "\t");

        }
    }

}

class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Rotate r = new Rotate(arr);
        r.getArray();

    }
}