package data;

import intercom.data.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testDistanceFromIntercomIsZerio() {
        Customer c = new Customer(37.788802, -122.4025067, 1, "Aashish");
        assertEquals(0.0, c.getDistanceFromIntercom(), 0.01);
    }
}
