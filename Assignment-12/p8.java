// public Problem 7: E-commerce Order System 

// Abstract class Order:

// orderId, amount

// abstract methods processOrder(), cancelOrder()

// concrete method orderSummary()

// Subclasses:

// OnlineOrder

// StorePickupOrder

// Interface DiscountApplicable with applyDiscount() method.

// Only OnlineOrder gets discount. p8 {

// }

interface DiscountApplicable {
    void applyDiscount(double percent);
}

abstract class Order {
    protected String orderId;
    protected double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public abstract void processOrder();

    public abstract void cancelOrder();

    public void orderSummary() {
        System.out.println(
                "Order ID: " + orderId +
                        ", Amount: $" + String.format("%.2f", amount));
    }
}

class OnlineOrder extends Order implements DiscountApplicable {
    public OnlineOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    public void processOrder() {
        System.out.println("Online order " + orderId + " is being shipped.");
    }

    public void cancelOrder() {
        System.out.println("Online order " + orderId + " has been cancelled and refunded.");
    }

    public void applyDiscount(double percent) {
        double discount = amount * percent / 100.0;
        amount -= discount;
        System.out.println("Discount of " + percent + "% applied. New amount: $" + amount);
    }
}

class StorePickupOrder extends Order {
    public StorePickupOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    public void processOrder() {
        System.out.println("Store pickup order " + orderId + " is ready for pickup.");
    }

    public void cancelOrder() {
        System.out.println("Store pickup order " + orderId + " cancelled. Please visit the store for refund.");
    }
}

class Main {
    public static void main(String[] args) {
        
        OnlineOrder online = new OnlineOrder("ON123", 100.0);
        StorePickupOrder pickup = new StorePickupOrder("SP456", 60.0);

        online.orderSummary();
        online.applyDiscount(10); 
        online.processOrder();
        online.cancelOrder();

        pickup.orderSummary();
        pickup.processOrder();
        pickup.cancelOrder();
    }
}
