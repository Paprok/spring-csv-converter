package com.codecool.app;

import com.codecool.app.formats.Formats;
import com.codecool.app.readers.FileLoader;

public class SimpleCsvConverter {

    public void converter(FileLoader file){
        converter(file, Formats.TABLE);
    }

    public void converter(FileLoader file, Formats format){
        System.out.printf("I convert CSV to %s format\n", format.toString().toLowerCase());
        System.out.println(file.getReadFile());
    }


}
