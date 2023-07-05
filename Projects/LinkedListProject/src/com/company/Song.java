package com.company;

public class Song {
    private final String title;
    private final String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", duration='" + duration + '\'';
    }

    public String getTitle() {
        return this.title;
    }

    public String getDuration() {
        return this.duration;
    }
}
