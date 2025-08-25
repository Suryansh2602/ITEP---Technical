// Write a Java program to remove duplicate elements from an array and print the unique elements.
// Example:

// Input: [1, 2, 2, 3, 4, 4, 5]
// Output: [1, 2, 3, 4, 5]

class Remove {
    private int arr[];

    public Remove(int arr[]) {
        this.arr = arr;
    }

    public void Duplicate() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (this.arr[i] == this.arr[j]) {
                    this.arr[i] = 0;
                }
            }
        }

        // for (int i = 0; i < n - 1; i++) {
        // if (arr[i] == 0) {
        // arr[i] = this.arr[i - 1];

        // }

    }

    public void display() {
        for (int i : this.arr) {
            System.out.print("\t" + i);

        }
    }
}

class Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };
        Remove a = new Remove(arr);
        a.Duplicate();
        a.display();
    }
}