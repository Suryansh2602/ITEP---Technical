import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String... args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(40);
        System.out.println(al);
        al.remove(new Integer(10));
        System.out.println(al);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 10) {
                itr.remove();
            }
            // System.out.println(itr.next());
        }
        System.out.println(al);

    }
}