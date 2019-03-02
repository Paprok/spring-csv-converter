package com.codecool;

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
            if(format.equals(word)){
                return  format;
            }
        }
        throw new FormatNotFoundException();
    }
}
