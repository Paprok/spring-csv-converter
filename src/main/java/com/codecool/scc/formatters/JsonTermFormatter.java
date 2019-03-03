package com.codecool.scc.formatters;

import java.util.List;

public class JsonTermFormatter implements OutputFormatter {

    @Override
    public String format(List<String> list) {
        return "totally JSON";
    }
}
