package com.company.taskManagmentSystem.core;

import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.exception.UserInvalidException;
import com.company.taskManagmentSystem.models.MemberImpl;
import com.company.taskManagmentSystem.models.TeamImpl;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.models.contracts.Nameable;
import com.company.taskManagmentSystem.models.contracts.Team;

import java.util.ArrayList;
import java.util.List;

public class TmsRepositoryImpl implements TmsRepository {

    private List<Member> memberList;
    private List<Team> teamList;

    public TmsRepositoryImpl() {
        this.memberList = new ArrayList<>();
        this.teamList = new ArrayList<>();
    }

    @Override
    public Member createMember(String name) {
        Member member = new MemberImpl(name);
        memberList.add(member);
        return member;
    }

    @Override
    public List<Member> getMember() {
        return new ArrayList<>(memberList);
    }

    @Override
    public List<Team> getTeam() {
        return new ArrayList<>(teamList);
    }

    @Override
    public void addMember(Member member) {
        memberList.add(member);
    }

    @Override
    public void addTeam(Team team) {
        teamList.add(team);
    }

    @Override
    public Team createTeam(String name) {
        Team team = new TeamImpl(name);
        teamList.add(team);
        return team;
    }

    public Team findTeamByName(String nameTeam){
        for (Team name: getTeam()){
            if (nameTeam.equalsIgnoreCase(name.getName())){
                return name;
            }
        }
        throw new IllegalArgumentException(String.format("Team name %s not exists",nameTeam));
    }

    public Member findMemberByName(String nameMember){
        for (Member name: getMember()){
            if (nameMember.equalsIgnoreCase(name.getName())){
                return name;
            }
        }
        throw new IllegalArgumentException(String.format("Team name %s not exists",nameMember));
    }

   private <T extends Nameable> T findNameByType(List<T> lists,T nameType){
        for(T t : lists){
            if (t.equals(nameType)){
                return t;
            }
        }
        throw new UserInvalidException(String.format("Team name %s not exists",nameType));
   }
}
