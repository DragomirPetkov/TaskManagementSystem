package com.company.taskManagmentSystem.core.contracts;

import com.company.taskManagmentSystem.models.contracts.Member;

import java.util.List;

public interface TmsRepository {

    Member createMember(String name);

    List<Member> getMember();
    void addMember(Member member);
}
