public class CustomerDetails {

    private String customerName;
    private String address;
    private double price;
    private int quantity;

    public CustomerDetails(String customerName, String address, double price, int quantity){
        this.customerName = customerName;
        this.address = address;
        this.price = price;
        this.quantity = quantity;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}