package com.codecool.scc.formatters;

import com.codecool.scc.formatters.formats.FormatNotFoundException;
import com.codecool.scc.formatters.formats.Formats;

public class OutputFormatterFactory {
    public OutputFormatter createByFormat(Formats format) {
        switch (format) {
            case XML:
                return new XmlTermFormatter();
            case JSON:
                return new JsonTermFormatter();
            case TABLE:
                return new TableTermFormatter();
            default:
                throw new FormatNotFoundException();
        }
    }
}
