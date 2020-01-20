# Intercom take home test

## Run Instructions
- 

## Packages
- ui: Responsible for displaying and outputting data
- processor: Responsible for processing and manipulating data
- datamanagement: Responsible for parsing data from files
- data: Responsible for representing data
- tests: Responsible for testing all classes
- logger: Responsible for logging outputs

## Design Decisions
Each package is layered as the following:
ui --> processor --> datamanagement --> data

Each layer can only access the layer after it to ensure modularity and separability.

As a result the following flow occurs:

- the Main class uses the inputter to output the answer to the output file.
- The inputter uses the processor to get a list of the ordered, filtered customers. Additionally, the inputter uses the logger to output the customers to an output file.
- The processor uses the CustomerListJSONParser to collect a list of all the Customers in the input file.
- The CustomerListJSONParser uses the Customer class to store the information from the input file.

## Extensions
This project can be extended in the following ways:

- Add additional parsers in the datamanagement class. For example, customer lists can be parsed from csv files, or text files, 



