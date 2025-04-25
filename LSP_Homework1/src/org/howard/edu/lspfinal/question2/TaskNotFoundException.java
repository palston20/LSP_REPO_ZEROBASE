package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a task is not found in the TaskManager.
 */
public class TaskNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a TaskNotFoundException with a detailed message.
     * 
     * @param message the detail message explaining the cause of the exception
     */
    public TaskNotFoundException(String message) {
        super(message);
    }
}
//Credit: Used ChatGPT to solve serialVersionUID issue