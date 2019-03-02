package com.codecool;


import com.codecool.view.View;
import com.codecool.view.ViewTerm;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConverterApp {
    public static void main(String[] args) {
        View view = new ViewTerm();
        Formats format = Formats.TABLE;
        FileReader file;
        try {
            if (args.length < 1) {
                view.noInputFileMsg();
            } else if (args.length == 1) {
                file = new FileReader(args[0]);
            } else {
                format = Formats.getFormat(args[0]);
                file = new FileReader(args[1]);
            }
        } catch (FormatNotFoundException e) {
            view.wrongFormatMsg();
        } catch (FileNotFoundException e) {
            view.fileNotFound();
        }
    }
}
