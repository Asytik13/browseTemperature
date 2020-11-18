package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.springboot.WeatherService.*;

@RestController
public class WeatherServiceController {

	@RequestMapping("/")
	public String index() {
		System.out.println(	"Please enter city");
		String city = UserInput.getCityFromUser();
		String temperature = "The temperature in "+ city+ " is "+ getWeatherFor(city) +"C";
		return temperature;
	}
}
