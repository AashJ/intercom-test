package intercom.logging;


import intercom.Main;
import intercom.data.Customer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Singleton class built for logging functionality.
 */
public class Logger {
    private Logger() {
    }

    private static Logger instance = new Logger();
    public static Logger getInstance() { return instance; }

    public void log(String msg) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(Main.outputFile, true));
        out.println(msg);
        out.close();
    }

    public void logCustomer(Customer c) throws IOException {
        log(c.getUserId() + "\t" + c.getName());
    }

}
