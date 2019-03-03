package com.codecool.scc;

import com.codecool.scc.formatters.OutputFormatter;
import com.codecool.scc.formatters.OutputFormatterFactory;
import com.codecool.scc.formatters.formats.Formats;
import com.codecool.scc.readers.FileLoader;

public class SimpleCsvConverter {

    public void converter(FileLoader file, OutputFormatterFactory factory){
        converter(file, Formats.TABLE, factory);
    }

    public void converter(FileLoader file, Formats format, OutputFormatterFactory factory){
        System.out.printf("Converted CSV to %s format\n", format.toString().toLowerCase());
        OutputFormatter formatter = factory.createByFormat(format);
        System.out.println(formatter.format(file.getReadFile()));
    }


}
