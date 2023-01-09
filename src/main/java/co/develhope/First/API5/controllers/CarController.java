package co.develhope.First.API5.controllers;

import co.develhope.First.API5.entities.CarDTO;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;


@RestController
@RequestMapping(value = "/cars")
public class CarController {
    @GetMapping
    public CarDTO getCar(){
        return new CarDTO("ID","Panda",999.9);
    }
    @PostMapping
    public void postCar(@Valid @RequestBody(required = true)CarDTO car) {
        System.out.println(car);

    }
}
