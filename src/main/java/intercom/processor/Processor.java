package intercom.processor;

import intercom.data.Customer;
import intercom.datamanagement.CustomerListJSONParser;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Processor {
    private String inputFile;
    public Processor(String inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * Gets all customers from the CustomerListJSONParser then filters using java8 streams.
     *
     * @param distanceFilter The distance at which to filter customers
     * @return A list of ordered, fitlered customers.
     * @throws IOException
     */
    public List<Customer> getOrderedCustomers(double distanceFilter) throws IOException {
        CustomerListJSONParser clip = new CustomerListJSONParser(this.inputFile);
        List<Customer> allCustomers = clip.parseCustomerJSONInput();
        allCustomers = allCustomers
                .stream()
                .filter(c -> c.getDistanceFromIntercom() <= distanceFilter)
                .sorted(Comparator.comparingInt(Customer::getUserId))
                .collect(Collectors.toList());

        return allCustomers;
    }
}
