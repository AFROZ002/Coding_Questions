package Supai_Infotech; // Declare the package

import java.io.*; // Import the Java I/O classes
import java.util.*; // Import the Java utility classes

// Define the Employee class
class Employee {
    int employeeId; // Employee ID
    String firstName; // Employee first name
    String lastName; // Employee last name
    int age; // Employee age
    double salary; // Employee salary

    // Constructor to initialize the Employee object
    public Employee(int employeeId, String firstName, String lastName, int age, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Getter method for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Override the toString method to print employee details
    @Override
    public String toString() {
        return  firstName + ", " + lastName + ", " + age;
    }
}

// Define the main class Employees1
public class Employees1 {

    // Main method - entry point of the program
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(); // Create a list to hold Employee objects

        // Load the file using the class loader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                Employees1.class.getResourceAsStream("/Supai_Infotech/Employee.txt")))) {
            String line; // Variable to hold each line from the file
            boolean isFirstLine = true; // Flag to check if the line is the header
            while ((line = br.readLine()) != null) { // Read the file line by line
                if (isFirstLine) { // Check if the line is the header
                    isFirstLine = false; // Set the flag to false after reading the header
                    continue; // Skip the header line
                }
                String[] data = line.split(","); // Split the line by comma
                if (data.length != 5) { // Check if the line has 5 elements
                    throw new IllegalArgumentException("Invalid data format"); // Throw an error if the format is invalid
                }
                // Parse the employee details from the line
                int employeeId = Integer.parseInt(data[0]); // Parse employee ID
                String firstName = data[1]; // Get first name
                String lastName = data[2]; // Get last name
                int age = Integer.parseInt(data[3]); // Parse age
                double salary = Double.parseDouble(data[4]); // Parse salary
                employees.add(new Employee(employeeId, firstName, lastName, age, salary)); // Add the employee to the list
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage()); // Handle file not found exception
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage()); // Handle I/O exception
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in file: " + e.getMessage()); // Handle number format exception
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); // Handle illegal argument exception
        }

        // Sort the list of employees by first name and then by age
        employees.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge));

        // Print the sorted list of employees
        for (Employee employee : employees) {
            System.out.println(employee); // Print each employee's details
        }
    }
}
