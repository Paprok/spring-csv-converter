package com.codecool.scc.formatters;

import java.util.List;

public class TableTermFormatter implements OutputFormatter {

    @Override
    public String format(List<String> list) {
        StringBuilder formatted = new StringBuilder("|");
        for(String word : list){
            formatted.append(String.format(" %s |", word));
        }
        return formatted.toString();
    }
}
