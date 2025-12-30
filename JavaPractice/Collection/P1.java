import java.util.*;

class Category {
    ArrayList<String> furniture = new ArrayList<String>();
    ArrayList<String> cosmetic = new ArrayList<String>();
    ArrayList<String> electronic = new ArrayList<String>();

    HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

    void addProducts() {
        furniture.add("Chair");
        furniture.add("Table");
        furniture.add("Bed");

        cosmetic.add("Lipstick");
        cosmetic.add("Vaseline");
        cosmetic.add("Eyeliner");

        electronic.add("Laptop");
        electronic.add("Mobile");
        electronic.add("TV");

        hm.put("Furniture", furniture);
        hm.put("Cosmetic", cosmetic);
        hm.put("Electronic", electronic);
    }

    void show() {
        for (String c : hm.keySet()) {
            System.out.println(c + " : " + hm.get(c));

        }

    }

}

class Main {
    public static void main(String[] args) {
        Category a = new Category();
        a.addProducts();
        a.show();
    }
}
