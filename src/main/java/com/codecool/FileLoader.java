package com.codecool;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileLoader {

    public FileReader loadFile(String fileName) throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        return new FileReader(classLoader.getResource(fileName).getFile());
    }
}
