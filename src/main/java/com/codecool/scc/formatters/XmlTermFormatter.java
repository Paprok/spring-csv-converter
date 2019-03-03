package com.codecool.scc.formatters;

import java.util.List;

public class XmlTermFormatter implements OutputFormatter {

    @Override
    public void showFormatted(List<String> list) {
        System.out.println("totally xml formatted");
    }
}
