package com.codecool;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConverterApp {
    public static void main(String[] args) {
        View view = new ViewTerm();
        Formats format;
        FileLoader loader = new FileLoader();
        SimpleCsvConverter converter = new SimpleCsvConverter();
        try {
            if (args.length < 1) {
                view.noInputFileMsg();
            } else if (args.length == 1) {
                loader.loadFile(args[0]);
                converter.converter(loader);
            } else {
                format = Formats.getFormat(args[0]);
                loader.loadFile(args[1]);
                converter.converter(loader, format);
            }
        } catch (FormatNotFoundException e) {
            view.wrongFormatMsg();
        } catch (FileNotFoundException e) {
            view.fileNotFound();
        }
    }
}
