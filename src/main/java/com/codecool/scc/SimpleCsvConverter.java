package com.codecool.scc;

import com.codecool.scc.formatters.OutputFormatter;
import com.codecool.scc.formatters.OutputFormatterFactory;
import com.codecool.scc.formatters.formats.Formats;
import com.codecool.scc.readers.FileLoader;

import java.io.FileNotFoundException;

public class SimpleCsvConverter {
    private FileLoader file;
    private OutputFormatterFactory factory;

    public SimpleCsvConverter(FileLoader file, OutputFormatterFactory factory) {
        this.file = file;
        this.factory = factory;
    }

    public void setFile(String fileName) throws FileNotFoundException {
        file.setFile(fileName);
    }

    public void convert() {
        convert(Formats.TABLE);
    }

    public void convert(Formats format) {
        System.out.printf("Converted CSV to %s format\n", format.toString().toLowerCase());
        OutputFormatter formatter = factory.createByFormat(format);
        System.out.println(formatter.format(file.getReadFile()));
    }


}
