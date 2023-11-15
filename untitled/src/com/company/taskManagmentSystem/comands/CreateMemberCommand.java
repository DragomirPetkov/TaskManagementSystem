package com.company.taskManagmentSystem.comands;

import com.company.taskManagmentSystem.core.contracts.Command;
import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.List;

public class CreateMemberCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 1;
    public static final String MEMBER_CREATED = "Member whith name %s created!";

    private final TmsRepository tmsRepository;

    public CreateMemberCommand(TmsRepository tmsRepository){
        this.tmsRepository = tmsRepository;
    }
    @Override
    public String execute(List<String> parameters) {
        ValidateHelper.validateArgumentsCount(parameters,EXPECTED_NUMBER_OF_ARGUMENTS);
        String name = parameters.get(0);
        return createMember(name);
    }

    private String createMember(String name){
        Member member = tmsRepository.createMember(name);
        return String.format(MEMBER_CREATED,name);
    }
}
