//  Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer

class MathOperation {

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public int multiply(int[] arr) {
        int prod = 1;
        for (int num : arr) {
            prod *= num;
        }
        return prod;
    }

    public double multiply(double a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperation mo = new MathOperation();

        System.out.println("Multiplication of two integers: " + mo.multiply(3, 4));          
        System.out.println("Multiplication of three floats: " + mo.multiply(1.2f, 3.4f, 2.0f));
        int[] arr = {2, 3, 4};
        System.out.println("Multiplication of array: " + mo.multiply(arr));                  
        System.out.println("Multiplication of double and int: " + mo.multiply(2.5, 4));      }
        
}
