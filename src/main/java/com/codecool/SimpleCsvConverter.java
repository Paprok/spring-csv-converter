package com.codecool;

import java.io.FileReader;

public class SimpleCsvConverter {

    public void converter(FileReader file){
        converter(file, Formats.TABLE);
    }

    public void converter(FileReader file, Formats format){
        System.out.printf("I convert CSV to %s format", format.toString().toLowerCase());
    }
}
