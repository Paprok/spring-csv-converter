package com.codecool.scc.formatters;

import java.util.List;

public class JsonTermFormatter implements OutputFormatter {

    @Override
    public void showFormatted(List<String> list) {
        System.out.println("totally JSON");
    }
}
