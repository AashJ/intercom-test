package intercom.ui;


import intercom.Main;
import intercom.data.Customer;
import intercom.logging.Logger;
import intercom.processor.Processor;

import java.io.IOException;
import java.util.List;

public class Inputter {
    Processor p;
    public Inputter(String inputFile) {
        p = new Processor(inputFile);
    }

    public void outputAnswer() throws IOException {
        List<Customer> customers = p.getOrderedCustomers(Main.DISTANCE_FILTER_KM);
        Logger l = Logger.getInstance();
        for (Customer c : customers) {
            l.logCustomer(c);
        }
    }
}
