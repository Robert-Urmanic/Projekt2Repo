package com.engeto.urm;

import com.engeto.urm.dao.InitialDemoData;
import com.engeto.urm.service.Application;

public class Main {

    public static void main(String[] args) {
//        InitialDemoData initialDemoData = new InitialDemoData();
//        initialDemoData.initialisation();
        Application.run();
    }
}
