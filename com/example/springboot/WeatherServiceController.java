package com.example.springboot;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static com.example.springboot.WeatherService.*;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class WeatherServiceController {

	@RequestMapping("/welcome")
	public String index2(){
		return "Please enter city";
	}

	@RequestMapping(value = "/getCity", method = POST)
	public String index3(){
		return UserInput.getCityFromUser();
	}

	@RequestMapping("/")
	public String index() {
		System.out.println(	"Please enter city");

		String city = index3();
		String temperature = "The temperature in "+ city+ " is "+ getWeatherFor(city) +"C";
		return temperature;
	}




//	@GetMapping("/temperature")
//	public String temperatureForm(Model model) {
//		model.addAttribute("temperature", new WeatherService());
//		return "temperature";
//	}
//
//	@PostMapping("/greeting")
//	public String citySubmit(@ModelAttribute WeatherService city, Model model) {
//		model.addAttribute("city", city);
//		return "result";
//	}

}
