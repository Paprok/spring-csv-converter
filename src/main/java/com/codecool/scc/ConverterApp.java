package com.codecool.scc;


import com.codecool.scc.formatters.OutputFormatterFactory;
import com.codecool.scc.formatters.formats.FormatNotFoundException;
import com.codecool.scc.formatters.formats.Formats;
import com.codecool.scc.readers.FileLoader;
import com.codecool.scc.view.View;
import com.codecool.scc.view.ViewTerm;

import java.io.FileNotFoundException;

public class ConverterApp {
    public static void main(String[] args) {
        View view = new ViewTerm();
        Formats format;
        FileLoader loader = new FileLoader();
        SimpleCsvConverter converter = new SimpleCsvConverter();
        OutputFormatterFactory factory = new OutputFormatterFactory();
        try {
            if (args.length < 1) {
                view.noInputFileMsg();
            } else if (args.length == 1) {
                loader.loadFile(args[0]);
                converter.converter(loader,factory);
            } else {
                format = Formats.getFormat(args[0]);
                loader.loadFile(args[1]);
                converter.converter(loader, format, factory);
            }
        } catch (FormatNotFoundException e) {
            view.wrongFormatMsg();
        } catch (FileNotFoundException e) {
            view.fileNotFound();
        }
    }
}
