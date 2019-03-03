package com.codecool.scc.formatters;

import java.util.List;

public class TableTermFormatter implements OutputFormatter{

    @Override
    public void showFormatted(List<String> list) {
        System.out.println("totally formatted table");
    }
}
