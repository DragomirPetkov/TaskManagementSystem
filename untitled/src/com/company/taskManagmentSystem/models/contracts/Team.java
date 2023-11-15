package com.company.taskManagmentSystem.models.contracts;

import java.util.List;

public interface Team extends Nameable {

    List<Member> getMember();
    List<Board> getBoard();

    void addMember(Member member);
    void addBoard(Board board);
}
