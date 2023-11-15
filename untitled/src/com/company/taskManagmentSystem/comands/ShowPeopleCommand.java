package com.company.taskManagmentSystem.comands;

import com.company.taskManagmentSystem.core.CommandFactoryImpl;
import com.company.taskManagmentSystem.core.TmsRepositoryImpl;
import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.CommandFactory;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.List;

public class ShowPeopleCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 0;

    private final TmsRepository tmsRepository;

    public ShowPeopleCommand(TmsRepository tmsRepository){
        this.tmsRepository = tmsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidateHelper.validateArgumentsCount(parameters,EXPECTED_NUMBER_OF_ARGUMENTS);
        return showPeople();
    }

    private String showPeople(){
        List<Member> members = tmsRepository.getMember();

        StringBuilder sb = new StringBuilder();
        int number = 1;
        for (Member member : members){
            sb.append(number).append(".").append(member.getName()).append(System.lineSeparator());
            number++;
        }
        return sb.toString().trim();
    }
}
