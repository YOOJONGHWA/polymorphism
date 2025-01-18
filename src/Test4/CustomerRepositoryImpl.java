package Test4;

import java.util.HashMap;

public class CustomerRepositoryImpl implements CustomerRepository{

    private static HashMap<String,Customer> customers = new HashMap<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.name, customer);
    }

    @Override
    public void getAllCustomers() {
        for(Customer customer : customers.values()) {
            System.out.println(customer.name);
        }
    }
}
