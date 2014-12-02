package com.example.peterho.materialdemo;


public class Country {

    private String name;
    private int flagResID;

    public Country(String name, int flagResID) {
        this.name = name;
        this.flagResID = flagResID;
    }

    public String getName() {
        return name;
    }

    public int getFlagResID() {
        return flagResID;
    }

}
