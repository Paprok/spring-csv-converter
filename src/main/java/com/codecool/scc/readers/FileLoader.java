package com.codecool.app.readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileLoader {
    private FileReader reader;

    public void loadFile(String fileName) throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource(fileName);
        try {
            this.reader = new FileReader(url.getFile());
        } catch (NullPointerException e) {
            throw new FileNotFoundException();
        }
    }

    public List<String> getReadFile() {
        List<String> list = new ArrayList<>();
        try (BufferedReader bReader = new BufferedReader(reader)) {
            addLine(bReader, list);
        } catch (IOException e) {
            System.out.println("Couldn't read file");
        }
        return list;
    }

    private void addLine(BufferedReader bReader, List<String> list) throws IOException {
        String line = bReader.readLine();
        while (line != null) {
            String[] words = line.split("[,;/|\\s]");
            list.addAll(Arrays.asList(words));
            line = bReader.readLine();
        }
    }
}
