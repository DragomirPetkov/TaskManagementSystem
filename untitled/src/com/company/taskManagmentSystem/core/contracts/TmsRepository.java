package com.company.taskManagmentSystem.core.contracts;

import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.models.contracts.Team;

import java.util.List;

public interface TmsRepository {

    Member createMember(String name);

    List<Member> getMember();
    List<Team> getTeam();
    void addMember(Member member);
    void addTeam(Team team);

    Team createTeam(String name);

    public Team findTeamByName(String nameTeam);
    public Member findMemberByName(String nameMember);

}
