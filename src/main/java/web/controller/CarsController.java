package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(name = "count", defaultValue = "5") String num) {
        List<Car> carList = new ArrayList<>();
        CarService carService = new CarServiceImpl();
        carList.add(new Car("Lada sedan", 2107, "Backlazhan"));
        carList.add(new Car("BMW", 5, "Blue with black stripes"));
        carList.add(new Car("Ford", 150, "Raptor red"));
        carList.add(new Car("Alfa Romeo", 1010, "Victoria white"));
        carList.add(new Car("KamAZ", 4320, "Service orange"));

        model.addAttribute("cars", carService.getSomeCars(carList, Integer.parseInt(num)));
        return "cars";
    }

}