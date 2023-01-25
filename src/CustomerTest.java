import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        customer.setID(10);
        customer.setIsNew(false);
        customer.setTotal(120.5F);
        customer.displayCustomerInfo();
    }
}
