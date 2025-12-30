import java.util.HashSet;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        HashSet<Student> student = new HashSet<>();
        student.add(new Student(1, 21, "Suryansh"));
        student.add(new Student(1, 22, "Hello "));
        student.add(new Student(2, 23, "Hello "));

        Iterator<Student> ite = student.iterator();

        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

    }
}