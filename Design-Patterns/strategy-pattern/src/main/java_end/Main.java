public class Main {
    public static void main(String[] args) {
        CustomerBill bill = new CustomerBill(new DeliveryOrderWithSurgeBillingStrategy());
        bill.addItemToOrder("Frogs", 20.25);
        bill.addItemToOrder("sdfkljhgakldsdg", 1000.3);
        bill.addItemToOrder("Froadfgadfggs", 46.259);
        bill.addItemToOrder("adfg", 11d);
        bill.printReceipt();
    }
}
