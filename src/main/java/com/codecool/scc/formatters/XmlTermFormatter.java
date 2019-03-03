package com.codecool.scc.formatters;

import java.util.List;

public class XmlTermFormatter implements OutputFormatter {

    @Override
    public String format(List<String> list) {
        StringBuilder formatted = new StringBuilder("<words>\n");
        for(String word : list){
            formatted.append(String.format("  <word> %s </word>\n", word));
        }
        formatted.append("</words>");
        return formatted.toString();
    }
}
