package org.howard.edu.lspfinal.question2;

import java.util.HashMap;
import java.util.Map;

/**
 * This class manages a collection of tasks and provides the operations
 * to add,update, retrieve, and print them.
 */

public class TaskManager {

    // Map to store tasks: key = task name, value = {priority, status}
    private Map<String, String[]> tasks = new HashMap<>();

    /**
     * Adds a new task to the Task Manager
     * 
     * @param name     the unique name of the task 
     * @param priority the priority/urgency of the task
     * @param status   the status of the task (to-do, in progress, or done)
     * @throws DuplicateTaskException if the task name already exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new String[]{String.valueOf(priority), status});
    }

    
    
    /**
     * Retrieves the details of a task by its name.
     * 
     * @param name  the name of the task that is to be retrieved
     * @return  returns a formatted string with details of the tasks
     * @throws TaskNotFoundException  if the task is not found
     */
    public String getTaskByName(String name) throws TaskNotFoundException {
        String[] task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return "Task{name='" + name + "', priority=" + task[0] + ", status='" + task[1] + "'}";
    }

    
    /**
     * Updates the status of each task
     * 
     * @param name  the name of the task that needs to be updated
     * @param status the status of the task
     * @throws TaskNotFoundException if the task is not found
     */
    public void updateStatus(String name, String status) throws TaskNotFoundException {
        String[] task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        task[1] = status;
    }

    /**
     * Prints all tasks which are grouped by their current status
     * Each group is labeled with their status and the task under it
     */
    public void printTasksGroupedByStatus() {
        Map<String, StringBuilder> statusGroups = new HashMap<>();
        
        for (Map.Entry<String, String[]> entry : tasks.entrySet()) {
            String taskName = entry.getKey();
            String[] taskDetails = entry.getValue();
            String taskStatus = taskDetails[1];
            
            String taskInfo = "  Task{name='" + taskName + "', priority=" + taskDetails[0] + ", status='" + taskStatus + "'}\n";
            
            statusGroups
                .computeIfAbsent(taskStatus, k -> new StringBuilder(k + ":\n"))
                .append(taskInfo);
        }

        for (StringBuilder tasksInStatus : statusGroups.values()) {
            System.out.print(tasksInStatus.toString());
        }
    }
}
