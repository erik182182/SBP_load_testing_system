package ru.erik182.enums;

public enum QueueDirection {
    IN("in"), OUT("out");

    private String title;


    QueueDirection(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
