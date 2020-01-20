package intercom;

import intercom.ui.Inputter;

import java.io.IOException;

public class Main {
    public static final int DISTANCE_FILTER_KM = 100;
    public static String outputFile;
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Invalid number of arguments");
            System.exit(0);
        }
        String input = args[0];
        outputFile = args[1];

        Inputter inputter = new Inputter(input);
        inputter.outputAnswer();
    }
}
