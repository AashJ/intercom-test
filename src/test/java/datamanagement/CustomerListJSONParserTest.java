package datamanagement;

import intercom.data.Customer;
import intercom.datamanagement.CustomerListJSONParser;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerListJSONParserTest {

    @Test
    public void testInput1() throws IOException {
        CustomerListJSONParser jsonParser = new CustomerListJSONParser("test_input_1.txt");
        List<Customer> customers = jsonParser.parseCustomerJSONInput();
        assertEquals(2, customers.size());
        assertEquals(12, customers.get(0).getUserId());
        assertEquals(1, customers.get(1).getUserId());
    }

    @Test
    public void testEmptyFile() throws IOException {
         CustomerListJSONParser jsonParser = new CustomerListJSONParser("test_input_2.txt");
         List<Customer> customers = jsonParser.parseCustomerJSONInput();
         assertEquals(0, customers.size());
    }


    @Test(expected = IOException.class)
    public void fileNotFound() throws IOException {
        CustomerListJSONParser jsonParser = new CustomerListJSONParser("test_input.txt");
        jsonParser.parseCustomerJSONInput();
    }
}
