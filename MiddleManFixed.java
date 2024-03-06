//// Class to represent customer, with name and address
//class Customer {
//    private String name;
//    private String address;
//
//    public Customer(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//}
//
//// class to represent the order, with item and cost
//class Order {
//    private String item;
//    private double cost;
//
//    public Order(String item, double cost) {
//        this.item = item;
//        this.cost = cost;
//    }
//
//    public String getItem() {
//        return item;
//    }
//}
//
//// customer service class to handle customer/order interactions
//class CustomerService {
//    public void shipOrder(Order order) {
//        // code to ship order
//    }
//}
//
//public class MiddleManFixed {
//    public static void main(String[] args) {
//        Customer customer = new Customer("John Doe", "123 Main St");
//        Order order = new Order("Sweater", 22.45);
//
//        // retrieve name and address directly using Customer object
//        String customerName = customer.getName();
//        String customerAddress = customer.getAddress();
//
//        // retrieve order item directly using Order object
//        String itemToShip = order.getItem();
//
//        // Print
//        System.out.println("Customer Name: " + customerName);
//        System.out.println("Customer Address: " + customerAddress);
//        System.out.println("Item to ship: " + itemToShip);
//    }
//}