package com.codecool;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

public class FileLoader {
    private FileReader reader;

    public void loadFile(String fileName) throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL url =  classLoader.getResource(fileName);
        try {
            this.reader = new FileReader(url.getFile());
        }catch (NullPointerException e){
            throw new FileNotFoundException();
        }
    }
}
