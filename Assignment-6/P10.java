// Q.10 Find the Union and Intersaction of two sorted array.

class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 7 };

        // Union
        System.out.print("Union: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < b.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(b[i] + " ");
            }
        }
        System.out.println();

        // Intersection
        System.out.print("Intersection: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
