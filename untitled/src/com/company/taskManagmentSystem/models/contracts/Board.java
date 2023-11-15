package com.company.taskManagmentSystem.models.contracts;

import java.util.List;

public interface Board extends Nameable{

    List<Task> getTask();
    void addTsk(Task task);
}
