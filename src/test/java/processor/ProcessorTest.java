package processor;

import intercom.data.Customer;
import intercom.processor.Processor;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {

    @Test
    public void testOrderCustomers() throws IOException {
        Processor p = new Processor("test_input_3.txt");
        List<Customer> customers = p.getOrderedCustomers(Double.MAX_VALUE);
        assertEquals(1, customers.get(0).getUserId());
        assertEquals(2, customers.get(1).getUserId());
        assertEquals(3, customers.get(2).getUserId());
    }

    @Test
    public void testFilterCustomers() throws IOException {
        Processor p = new Processor("test_input_3.txt");
        List<Customer> customers = p.getOrderedCustomers(0);
        assertEquals(0, customers.size());
    }

}
