package com.company.taskManagmentSystem.comands;

import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.contracts.Team;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.List;

public class CeateTeamCommand implements Command {
    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 1;
    private static final String MEMBER_CREATED = "Team whith name %s created!";

    private final TmsRepository tmsRepository;

    public CeateTeamCommand(TmsRepository tmsRepository){
        this.tmsRepository = tmsRepository;
    }
    @Override
    public String execute(List<String> parameters) {
        ValidateHelper.validateArgumentsCount(parameters,EXPECTED_NUMBER_OF_ARGUMENTS);
        String name = parameters.get(0);
        return createTeam(name);
    }

    private String createTeam(String name){
        Team team = tmsRepository.createTeam(name);

        return String.format(MEMBER_CREATED,name);
    }
}
