import java.util.HashMap;
import java.util.Map;

public class DeliveryOrderWithSurgeBillingStrategy implements BillingStrategy {
    static final double DELIVERY_FEE = 12.64;

    @Override
    public double getSubtotal(HashMap<String, Double> orderedItems) {
        double subtotal = 0.0;
        for (Map.Entry<String, Double> item : orderedItems.entrySet()) {
            subtotal += item.getValue();
        }
        return subtotal + DELIVERY_FEE;
    }
}
