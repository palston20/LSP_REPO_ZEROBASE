package org.howard.edu.lspfinal.question3;

/**
 * Abstract base class representing a generic report.
 * Defines the template method for generating a report,
 * and abstract steps to be implemented by subclasses.
 */
public abstract class Report {
    /**
     * Template method that defines the steps to generate a report.
     */
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    /**
     * Loads the data specific to the report.
     */
    protected abstract void loadData();

    /**
     * Formats the data for presentation.
     */
    protected abstract void formatData();

    /**
     * Prints the final report.
     */
    protected abstract void printReport();
}
