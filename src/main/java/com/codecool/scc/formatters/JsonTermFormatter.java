package com.codecool.scc.formatters;

import java.util.List;

public class JsonTermFormatter implements OutputFormatter {

    @Override
    public String format(List<String> list) {
        StringBuilder formatted = new StringBuilder("{");
        formatted.append("[");
        for(String word : list){
            formatted.append(String.format("\"%s\", ", word));
        }
        formatted.append("]}");
        return formatted.toString();
    }


}
