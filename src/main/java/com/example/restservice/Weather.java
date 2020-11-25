package com.example.restservice;

public class Weather {

    private final long id;
    private final String content;
    private Double temperature;

    public Weather(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Weather(Double temperature) {
        this.temperature = temperature;
        this.id = 1;
        this.content = "some content";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Double getTemperature() {
        return temperature;
    }
}