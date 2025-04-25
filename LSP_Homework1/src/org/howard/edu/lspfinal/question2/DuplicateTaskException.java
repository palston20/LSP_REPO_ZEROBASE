package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when attempting to add a task that already exists in the TaskManager.
 */
public class DuplicateTaskException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a DuplicateTaskException with a detailed message.
     * 
     * @param message the detail message explaining the cause of the exception
     */
    public DuplicateTaskException(String message) {
        super(message);
    }
}

//Credit: Used ChatGPT to solve serialVersionUID issue