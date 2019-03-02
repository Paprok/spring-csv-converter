package com.codecool;

public class ViewTerm implements View {
    @Override
    public void noInputFileMsg() {
        System.out.println("No input file defined");
    }

    @Override
    public void wrongFormatMsg() {
        System.out.println("Format not found");
    }

    @Override
    public void fileNotFound() {
        System.out.println("File not found");
    }
}
