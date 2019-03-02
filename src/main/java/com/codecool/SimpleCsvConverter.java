package com.codecool;

public class SimpleCsvConverter {

    public void converter(FileLoader file){
        converter(file, Formats.TABLE);
    }

    public void converter(FileLoader file, Formats format){
        System.out.printf("I convert CSV to %s format", format.toString().toLowerCase());
    }
}
