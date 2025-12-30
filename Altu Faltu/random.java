import java.util.*;

class Demo {
    public static void main(String[] args) {
        Stack<Object> name = new Stack<Object>();
        name.push("Suryansh");
        name.push(21);
        name.push(7.79);
        name.push(3.14f);

        Iterator<Object> itr = name.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}