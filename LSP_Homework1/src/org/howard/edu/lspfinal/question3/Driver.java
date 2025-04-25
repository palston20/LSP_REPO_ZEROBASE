package org.howard.edu.lspfinal.question3;

/**
 * Driver class for testing the reporting system.
 * Demonstrates the use of the Template Method pattern with different report types.
 */
public class Driver {
    public static void main(String[] args) {
        Report salesReport = new SalesReport();
        Report inventoryReport = new InventoryReport();

        salesReport.generateReport();
        inventoryReport.generateReport();
    }
}
