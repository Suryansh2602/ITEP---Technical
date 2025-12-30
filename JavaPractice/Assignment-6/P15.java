/*
14. Find the first non-repeating elment in given array of integers
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3.

Example 2:
Input : arr[] = {1, 1, 1}
Output : 0
*/
class FirstNonRepeatingElement {
    private int arr[] = { -1, 2, -1, 3, 2 };
    private boolean checked[] = new boolean[arr.length];

    public void getRepeat() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (this.arr[i] == this.arr[j]) {
                    checked[j] = true;
                    checked[i] = true;
                }
            }
        }
    }

    public int getNonRepeated() {
        for (int i = 0; i < arr.length; i++) {
            if (!checked[i])
                return arr[i];
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        FirstNonRepeatingElement f1 = new FirstNonRepeatingElement();
        f1.getRepeat();
        System.out.println(f1.getNonRepeated());
    }
}