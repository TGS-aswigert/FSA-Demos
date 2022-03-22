import java.util.HashMap;
import java.util.Map;

public class DeliveryOrderBillingStrategy implements BillingStrategy {
    static final double DELIVERY_FEE = 2.48;

    @Override
    public double getSubtotal(HashMap<String, Double> orderedItems) {
        double subtotal = 0.0;
        for (Map.Entry<String, Double> item : orderedItems.entrySet()) {
            subtotal += item.getValue();
        }
        return subtotal + DELIVERY_FEE;
    }
}
