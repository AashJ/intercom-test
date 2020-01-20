# Intercom take home test

## Run Instructions

- Install gradle via: https://gradle.org/install/
- Install java via https://java.com/en/download/help/download_options.xml
- Run `gradle clean`
- Run `gradle fatJar`
- Run `java -jar build/libs/intercom-test-all-1.0-SNAPSHOT.jar [input] [output]`

To see existing sample output, look at `output.txt`.

## Dependencies
The only dependency used in this project is Gson: a reputable java library to parse json files. 

## Packages

- `ui`: Responsible for displaying and outputting data
- `processor`: Responsible for processing and manipulating data
- `datamanagement`: Responsible for parsing data from files
- `data`: Responsible for representing data
- `tests`: Responsible for testing all classes
- `logger`: Responsible for logging outputs

## Design Decisions
Each package is layered as the following:
ui --> processor --> datamanagement --> data

Each layer can only access the layer after it to ensure modularity and separability.

As a result the following flow occurs:

- the `Main` class uses the `inputter` to output the answer to the output file.
- The `inputter` uses the `processor` to get a list of the ordered, filtered customers. Additionally, the inputter uses the `logger` to output the customers to an output file.
- The `processor` uses the `CustomerListJSONParser` to collect a list of all the Customers in the input file. 
- The `CustomerListJSONParser` uses the `Customer` class to store the information from the input file. 
- The `Customer` uses the `Distance` class to determine its own distance from the Intercom office!

## Extensions
This project can be extended in the following ways:

- Add additional parsers in the `datamanagement` class. For example, customer lists can be parsed from csv files, or text files
- Add additional distance metrics in the `Distance` class
- Add additional fields to `Customer` class to keep track of more information
- Add additional logging information in the `logger` class



Thanks for reading!



