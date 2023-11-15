package com.company.taskManagmentSystem.core;

import com.company.taskManagmentSystem.comands.*;
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
                return new CreateMemberCommand(tmsRepository);
            case SHOWPEOPLE:
                return new ShowPeopleCommand(tmsRepository);
//                    SHOWPEOPLEACTIVITY,
            case CREATETEAM:
                return new CeateTeamCommand(tmsRepository);
            case SHOWTEAM:
                return new ShowTeamCommand(tmsRepository);
//                    SHOWTEAMACTIVITY,
            case  ADDPERSONTOTEAM:
                return new AddPersonToTeamCommand(tmsRepository);
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
                throw new IllegalArgumentException(String.format(INVALID_COMMAND, commandType));
        }
    }
}
