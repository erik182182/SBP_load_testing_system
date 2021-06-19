package ru.erik182.enums;

public enum InterfaceView {
    GRAPHICAL("graphical"), CONSOLE("console");

    private String title;

    InterfaceView(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
