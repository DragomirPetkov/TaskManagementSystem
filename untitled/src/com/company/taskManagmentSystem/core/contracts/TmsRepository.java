package com.company.taskManagmentSystem.core.contracts;

import com.company.taskManagmentSystem.models.contracts.Member;

public interface TmsRepository {

    Member createMember(String name);
}
