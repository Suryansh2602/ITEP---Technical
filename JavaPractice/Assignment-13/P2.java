// 2. "1,2,3,4,5,6,7,8,9,10"

class Main {
    public static void main(String... args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            Integer num = i; // autoboxing
            sb.append(num.toString());
            if (i != 10) {
                sb.append(",");
            }
        }
        System.out.print(" " + sb.toString());
    }
}