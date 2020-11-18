package com.example.springboot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherService {
    private static final Pattern tempPattern = Pattern.compile("^.*\"temp_c\":\\s*(.+?)\\s*,.*");

    public static Double getWeatherFor(String city) {
        final String url = "http://api.weatherapi.com/v1/current.json?key=972630bcf041404ba70190228200711&q=" + city;

        try (java.util.Scanner s = new java.util.Scanner(new java.net.URL(url).openStream())) {
            String resp = s.useDelimiter("\\A").next();
            Matcher m = tempPattern.matcher(resp);
            if (m.find()) {
                return Double.valueOf(m.group(1));
            }

            throw new RuntimeException("Cannot extract temp from: " + resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
