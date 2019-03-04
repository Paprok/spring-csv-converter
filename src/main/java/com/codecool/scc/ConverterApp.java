package com.codecool.scc;

import com.codecool.scc.formatters.formats.FormatNotFoundException;
import com.codecool.scc.formatters.formats.Formats;
import com.codecool.scc.view.View;
import com.codecool.scc.view.ViewTerm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class ConverterApp {
    public static void main(String[] args) {
        View view = new ViewTerm();
        Formats format;
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        SimpleCsvConverter converter = (SimpleCsvConverter) context.getBean("csvConverter");
        try {
            if (args.length < 1) {
                view.noInputFileMsg();
            } else if (args.length == 1) {
                converter.setFile(args[0]);
                converter.convert();
            } else {
                format = Formats.getFormat(args[0]);
                converter.setFile(args[1]);
                converter.convert(format);
            }
        } catch (FormatNotFoundException e) {
            view.wrongFormatMsg();
        } catch (FileNotFoundException e) {
            view.fileNotFound();
        }
    }
}
