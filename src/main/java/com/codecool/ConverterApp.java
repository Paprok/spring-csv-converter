package com.codecool;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConverterApp {
    public static void main(String[] args) {
        View view = new ViewTerm();
        Formats format;
        FileReader file;
        FileLoader loader = new FileLoader();
        SimpleCsvConverter converter = new SimpleCsvConverter();
        try {
            if (args.length < 1) {
                view.noInputFileMsg();
            } else if (args.length == 1) {
                file = loader.loadFile(args[0]);
                converter.converter(file);
            } else {
                format = Formats.getFormat(args[0]);
                file = loader.loadFile(args[1]);
                converter.converter(file, format);
            }
        } catch (FormatNotFoundException e) {
            view.wrongFormatMsg();
        } catch (FileNotFoundException e) {
            view.fileNotFound();
        }
    }
}
