package com.company.taskManagmentSystem.models;

import com.company.taskManagmentSystem.models.contracts.ActivityLog;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.models.contracts.Task;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.ArrayList;
import java.util.List;

public class MemberImpl implements Member,ActivityLog {

    private static final int NAME_MIN_LENGTH = 5;
    private static final int NAME_MAX_LENGTH = 15;
    private static final String NAME_ERROR_MESSAGE = String.format(
            "The MemberName must be %s and %s symbols!",
            NAME_MIN_LENGTH,
            NAME_MAX_LENGTH);

    private String name;
    private List<Task> taskList;
    private List<ActivityLog> activityLogList;

    public MemberImpl(String name) {
        setName(name);
        this.taskList = new ArrayList<>();
        this.activityLogList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name){
        ValidateHelper.validateString(name.length(),NAME_MIN_LENGTH,NAME_MAX_LENGTH,NAME_ERROR_MESSAGE);
        this.name = name;
    }

    @Override
    public List<Task> getTask() {
        return new ArrayList<>(taskList);
    }

    @Override
    public List<ActivityLog> getActivityLog() {
        return new ArrayList<>(activityLogList);
    }

    @Override
    public void addTask(Task task) {
        taskList.add(task);
    }

    @Override
    public void addActivityLog(ActivityLog activityLog) {
        activityLogList.add(activityLog);
    }
}
