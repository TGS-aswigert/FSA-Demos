import java.util.HashMap;

public interface BillingStrategy {
    double getSubtotal(HashMap<String, Double> orderedItems);
}
