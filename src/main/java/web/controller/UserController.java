package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class UserController {
//    private final CarService carService;
//
//    @Autowired
//    public CarController(CarService carService) {
//        this.carService = carService;
//    }
//
//    @GetMapping()
//    public String printCars(ModelMap model, @RequestParam(name = "count", required = false) Integer count) {
//        model.addAttribute("cars", carService.show(count));
//        return "cars";
//    }
}
