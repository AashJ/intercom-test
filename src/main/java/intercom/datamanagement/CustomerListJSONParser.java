package intercom.datamanagement;

import com.google.gson.Gson;
import intercom.data.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerListJSONParser {
    private String inputFile;
    public CustomerListJSONParser(String inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * Uses GSON to parse customer json files.
     * @return A list of the parsed customers
     * @throws IOException
     */
    public List<Customer> parseCustomerJSONInput() throws IOException {
        List<Customer> ret = new ArrayList<>();
        Gson gson = new Gson();

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line = reader.readLine();
        while (line != null) {
            Customer customer = gson.fromJson(line, Customer.class);
            ret.add(customer);
            line = reader.readLine();
        }

        return ret;
    }
}
