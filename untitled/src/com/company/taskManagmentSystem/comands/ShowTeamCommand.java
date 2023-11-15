package com.company.taskManagmentSystem.comands;

import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.contracts.Team;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.List;

public class ShowTeamCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 0;

    private TmsRepository tmsRepository;

    public ShowTeamCommand(TmsRepository tmsRepository) {
        this.tmsRepository = tmsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidateHelper.validateArgumentsCount(parameters, EXPECTED_NUMBER_OF_ARGUMENTS);
        return shoeTeam();
    }

    private String shoeTeam() {
        List<Team> teamList = tmsRepository.getTeam();

        StringBuilder sb = new StringBuilder();
        int index = 1;

        for (Team team : teamList) {
            sb.append(index).append(".").append(team.getName()).append(System.lineSeparator());
            index++;
        }
        return sb.toString().trim();
    }
}
