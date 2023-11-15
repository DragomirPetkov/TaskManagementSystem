package com.company.taskManagmentSystem.models.contracts;

import java.util.List;

public interface Member extends Nameable {

    List<Task> getTask();
    List<ActivityLog> getActivityLog();

    void addTask(Task task);
    void addActivityLog(ActivityLog activityLog);
}
