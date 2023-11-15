package com.company.taskManagmentSystem.models;

import com.company.taskManagmentSystem.models.contracts.ActivityLog;
import com.company.taskManagmentSystem.models.contracts.Board;
import com.company.taskManagmentSystem.models.contracts.Task;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.ArrayList;
import java.util.List;

public class BoarImpl implements Board, ActivityLog {

    private static final int NAME_MIN_LENGTH = 5;
    private static final int NAME_MAX_LENGTH = 15;
    private static final String NAME_ERROR_MESSAGE = String.format(
            "The BoardName must be %s and %s symbols!",
            NAME_MIN_LENGTH,
            NAME_MAX_LENGTH);

    private String name;
    private List<Task> taskslist;

    public BoarImpl(String name) {
        setName(name);
        this.taskslist = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        ValidateHelper.validateString(name.length(), NAME_MIN_LENGTH, NAME_MAX_LENGTH, NAME_ERROR_MESSAGE);
        this.name = name;
    }

    @Override
    public List<Task> getTask() {
        return new ArrayList<>(taskslist);
    }

    @Override
    public void addTsk(Task task) {
        taskslist.add(task);
    }
}
