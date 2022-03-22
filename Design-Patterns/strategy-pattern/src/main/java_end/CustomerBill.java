import java.util.HashMap;
import java.util.Map;

public class CustomerBill {
    private HashMap<String, Double> orderedItems = new HashMap<>();
    private final BillingStrategy billingStrategy;

    public CustomerBill(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public double getSubtotal() {
        return this.billingStrategy.getSubtotal(this.orderedItems);
    }

    public double getTax() {
        double subtotal = 0.0;
        for (Map.Entry<String, Double> item : orderedItems.entrySet()) {
            subtotal += item.getValue();
        }
        return subtotal * .075;
    }

    public double getTotalWithTax() {
        return getSubtotal() + getTax();
    }

    public void addItemToOrder(String itemName, Double itemPrice) {
        orderedItems.put(itemName, itemPrice);
    }

    public void printReceipt() {
        System.out.printf("%-15s %10s\n", "Item", "Price");
        System.out.println("--------------------------");
        for (Map.Entry<String, Double> item : orderedItems.entrySet()) {
            System.out.printf("%-15s %10.2f\n", item.getKey(), item.getValue());
        }
        System.out.println("--------------------------");
        checkDeliveryFee();
        System.out.printf("%-15s %10.2f\n", "Subtotal", getSubtotal());
        System.out.printf("%-15s %10.2f\n", "Tax", getTax());
        System.out.println("--------------------------");
        System.out.printf("%-15s %10.2f\n", "Total", getTotalWithTax());
    }

    public void checkDeliveryFee() {
        if (this.billingStrategy instanceof DeliveryOrderBillingStrategy) {
            System.out.printf("%-15s %10.2f\n", "Delivery Fee", DeliveryOrderBillingStrategy.DELIVERY_FEE);
        } else if (this.billingStrategy instanceof DeliveryOrderWithSurgeBillingStrategy) {
            System.out.printf("%-15s %10.2f\n", "Delivery Fee", DeliveryOrderWithSurgeBillingStrategy.DELIVERY_FEE);
        }
    }
}
