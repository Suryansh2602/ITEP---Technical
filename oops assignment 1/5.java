// Product Inventory
// Create a class Product with fields: productId, name, quantity, price.
// Use setters to assign values. Add a method to calculate total value (quantity * price).

class Product {
    private int productId;
    private String name;
    private int quantity;
    private double price;

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double calculateTotalValue() {
        return quantity * price;
    }
}
class TestMain{
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId(1);
        product.setName("Pen");
        product.setPrice(10.0);
        product.setQuantity(5);

        System.out.println("Total Value: " + product.calculateTotalValue());
    }
}