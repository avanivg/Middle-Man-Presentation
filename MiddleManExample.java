//Class to represent customer, with name and address 
class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// class to represent the order, with item and cost
class Order {
    private String item;
    private double cost;

    public Order(String item, double cost) {
        this.item = item;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }
}

// customer service class to handle customer/order interactions
class CustomerService {
    private Customer customer;
    private Order order;

    public CustomerService(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    // delegates the call to get the name of the customer to the Customer
    public String getCustomerName() {
        return customer.getName();
    }

    // delegates the call to get the address of the customer to Customer
    public String getCustomerAddress() {
        return customer.getAddress();
    }

    public String getOrderItem() {
        return order.getItem();
    }

    public void shipOrder(Order order) {
        // code to ship order
    }
}

public class MiddleManExample {
    public static void main(String[] args) {
        // customer, order, customer service values
        Customer customer = new Customer("John Doe", "123 Main St");
        Order order = new Order("Sweater", 22.45);
        CustomerService customerService = new CustomerService(customer, order);

        String customerName = customerService.getCustomerName();
        String customerAddress = customerService.getCustomerAddress();

        String itemToShip = customerService.getOrderItem();

        // Printing out the customer's name and address
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Item to ship: " + itemToShip);
    }
}