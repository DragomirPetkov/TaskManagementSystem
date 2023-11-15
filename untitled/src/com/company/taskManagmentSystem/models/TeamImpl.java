package com.company.taskManagmentSystem.models;

import com.company.taskManagmentSystem.models.contracts.Board;
import com.company.taskManagmentSystem.models.contracts.Member;
import com.company.taskManagmentSystem.models.contracts.Team;
import com.company.taskManagmentSystem.units.ValidateHelper;

import java.util.ArrayList;
import java.util.List;

public class TeamImpl implements Team {

    private static final int NAME_MIN_LENGTH = 5;
    private static final int NAME_MAX_LENGTH = 15;
    private static final String NAME_ERROR_MESSAGE = String.format(
            "The TeamName must be %s and %s symbols!",
            NAME_MIN_LENGTH,
            NAME_MAX_LENGTH);
    private String name;
    private List<Member> memberList;
    private List<Board> boardList;

    public TeamImpl(String name) {
        setName(name);
        this.memberList = new ArrayList<>();
        this.boardList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name){
        ValidateHelper.validateString(name.length(), NAME_MIN_LENGTH, NAME_MAX_LENGTH, NAME_ERROR_MESSAGE);
        this.name = name;
    }

    @Override
    public List<Member> getMember() {
        return new ArrayList<>(memberList);
    }

    @Override
    public List<Board> getBoard() {
        return new ArrayList<>(boardList);
    }

    @Override
    public void addMember(Member member) {
        memberList.add(member);
    }

    @Override
    public void addBoard(Board board) {
        boardList.add(board);
    }
}
