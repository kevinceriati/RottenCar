package com.rottencar.restservice.RestApp.model;

public class indexes {

    private static int id = 0;

    public static int getId(){
        id++;
        return id;
    }
}
