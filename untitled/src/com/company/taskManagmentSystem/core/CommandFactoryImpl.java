package com.company.taskManagmentSystem.core;

import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.CommandFactory;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;

public class CommandFactoryImpl implements CommandFactory {
    @Override
    public Command createCommandFromCommandName(String commandName, TmsRepository tmsRepository) {
        return null;
    }
}
