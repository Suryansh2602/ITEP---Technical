import java.util.*;

class Main {
    public static void main(String... args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Suryansh");
        map.put(2, "Anuj");
        map.put(3, "Hello");
        map.put(4, "World");

        Set<Map.Entry<Integer, String>> hs = map.entrySet();

        Iterator<Map.Entry<Integer, String>> ite = hs.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
            System.out.println();
        }

        for (Map.Entry<Integer, String> e : hs) {
            System.out.println(e);

        }

    }
}