package com.company.taskManagmentSystem.comands;

import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.models.contracts.Team;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.List;
import java.util.Scanner;

public class ShowTeamMembersCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 0;

    private final TmsRepository tmsRepository;

    public ShowTeamMembersCommand(TmsRepository tmsRepository) {
        this.tmsRepository = tmsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidateHelper.validateArgumentsCount(parameters,EXPECTED_NUMBER_OF_ARGUMENTS);
        return showMemberTeam();
    }
    private String showMemberTeam(){
        List<Team> teamList = tmsRepository.getTeam();

        int index = 1;
        StringBuilder sb  = new StringBuilder();

        for(Team team : teamList){

            sb.append(index).append(".").append(team.)
            index++;
        }
        return sb.toString().trim();
    }
}
