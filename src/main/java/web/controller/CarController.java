package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

import java.util.Optional;

@Controller
public class CarController {

    @RequestMapping("/cars")
    public String printCars2(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {
        int n = count.filter(x -> x < 5).orElse(5);
        model.addAttribute("cars", Service.getCar(n));
        return "cars";
    }
}
