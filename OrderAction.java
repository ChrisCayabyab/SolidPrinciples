public class OrderAction implements Order, OrderPrice {

    @Override
    public void calculateTotal(double price, int quantity) {
      double total = price * quantity;
      System.out.println("Order total: $" + String.format("%.2f", total));
    }
  
    @Override
    public void placeOrder(String customerName, String address) {
      // Simulate placing order in a system
      System.out.println("Order placed for " + customerName + " at " + address);
    }
  }
  