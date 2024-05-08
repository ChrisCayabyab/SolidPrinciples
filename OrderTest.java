public class OrderTest {

    public static void main(String[] args) {
    
        CustomerDetails Customer_one = new CustomerDetails("John Doe", "123 Main St", 10.0, 2);
        
       OrderAction ordered = new OrderAction();
       Email email = new Email();
       Invoice invoice = new Invoice(); 
        
        ordered.calculateTotal(Customer_one.getPrice(), Customer_one.getQuantity());
        ordered.placeOrder(Customer_one.getCustomerName(), Customer_one.getAddress());
    
        // These methods might not be needed for all orders
        invoice.generateInvoice("order_123.pdf");
        email.sendEmailNotification("johndoe@example.com");
  }
}