package com.company.taskManagmentSystem.core.contracts;

import com.company.taskManagmentSystem.core.TmsRepositoryImpl;

public interface CommandFactory {
    Command createCommandFromCommandName(String commandName, TmsRepository tmsRepository);
}
