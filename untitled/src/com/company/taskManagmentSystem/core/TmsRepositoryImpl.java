package com.company.taskManagmentSystem.core;

import com.company.taskManagmentSystem.core.contracts.TmsRepository;
import com.company.taskManagmentSystem.models.MemberImpl;
import com.company.taskManagmentSystem.models.contracts.Member;

import java.util.ArrayList;
import java.util.List;

public class TmsRepositoryImpl implements TmsRepository {

    private List<Member> memberList;

    public TmsRepositoryImpl(){
        this.memberList = new ArrayList<>();
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
    public void addMember(Member member) {
        memberList.add(member);
    }
}
