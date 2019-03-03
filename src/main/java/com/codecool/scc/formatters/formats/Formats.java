package com.codecool.scc.formatters.formats;

public enum Formats {
    JSON,
    XML,
    TABLE;

    @Override
    public String toString() {
        return this.name();
    }

    public static Formats getFormat(String word){
        word = word.trim().toUpperCase();
        for (Formats format: Formats.values()) {
            if(format.toString().equals(word)){
                return  format;
            }
        }
        throw new FormatNotFoundException();
    }
}
