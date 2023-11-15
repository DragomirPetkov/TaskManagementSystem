package com.company.taskManagmentSystem.comands;

import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.models.contracts.Team;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.List;

public class AddPersonToTeamCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 2;

    private TmsRepository tmsRepository;

    public AddPersonToTeamCommand(TmsRepository tmsRepository){
        this.tmsRepository = tmsRepository;
    }
    @Override
    public String execute(List<String> parameters) {
        ValidateHelper.validateArgumentsCount(parameters,EXPECTED_NUMBER_OF_ARGUMENTS);
        String nameTeam = parameters.get(0);
        String nameMember = parameters.get(1);
        return addPersonToTeam(nameTeam,nameMember);
    }

    private String addPersonToTeam(String nameTeam, String nameMember){
        Team team = tmsRepository.findTeamByName(nameTeam);
        Member member = tmsRepository.findMemberByName(nameMember);
        team.addMember(member);
        return String.format("Member %s added to team %s",nameMember,nameTeam);
    }
}
