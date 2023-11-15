package com.company.taskManagmentSystem;

import com.company.taskManagmentSystem.core.TmsEngineImpl;
import com.company.taskManagmentSystem.core.TmsRepositoryImpl;

public class Startup {
    public static void main(String[] args) {
        TmsEngineImpl engine = new TmsEngineImpl();
        engine.start();
    }
}