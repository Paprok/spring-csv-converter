package com.codecool.scc.formatters;

import com.codecool.scc.formatters.formats.FormatNotFoundException;
import com.codecool.scc.formatters.formats.Formats;

public class OutputFormatterFactory {
    public OutputFormatter createByFormat(Formats format) {
        switch (format) {
            case XML:
                return new XmlTermFormatter();
            break;
            case JSON:
                return new JsonTermFormatter();
            break;
            case TABLE:
                return new TableTermFormatter();
            break;
            default:
                throw new FormatNotFoundException();
        }
    }
}
