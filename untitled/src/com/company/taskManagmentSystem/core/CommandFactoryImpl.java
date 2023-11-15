package com.company.taskManagmentSystem.core;

import com.company.taskManagmentSystem.comands.CreatememberCommand;
import com.company.taskManagmentSystem.comands.ShowPeopleCommand;
import com.company.taskManagmentSystem.comands.enums.CommandType;
import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.CommandFactory;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;

public class CommandFactoryImpl implements CommandFactory {
    private static final String INVALID_COMMAND = "Invalid command name: %s!";

    @Override
    public Command createCommandFromCommandName(String commandName, TmsRepository tmsRepository) {
        CommandType commandType = CommandType.valueOf(commandName.toUpperCase());

        switch (commandType) {
            case CREATEMEMBER:
                return new CreatememberCommand(tmsRepository);
            case SHOWPEOPLE:
                return new ShowPeopleCommand(tmsRepository);
//                    SHOWPEOPLEACTIVITY,
//                    CREATETEAM,
//                    SHOWTEAM,
//                    SHOWTEAMACTIVITY,
//                    ADDPERSONTOTEAM,
//                    SHOWTEAMMEMBERS,
//                    CREATENEWBOARDTEAM,
//                    SHOWTEAMBOARD,
//                    CREATEBUGBOARD,
//                    CREATESTRORYBOARD,
//                    CREATEFEEDBACKBOARD,
//                    CHANGEPRIORITYBUG,
//                    CHANGESEVERITYBUG,
//                    CHANGESTATUSBUG,
//                    CHANGEPRIORITYSTORY,
//                    CHANGESIZESTORY,
//                    CHANGESTATUSSTORY,
//                    CHANGERATINGFEEDBACK,
//                    CHANGESTATUSFEEDBACK,
//                    ASSIGNETASKPERSON,
//                    UNASSIGNTASKPERSON,
//                    ADDCOMMENTTOTASK;
                    default:
                throw new IllegalArgumentException(String.format(INVALID_COMMAND, commandName));
        }
    }
}
