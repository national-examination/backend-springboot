package net.enjoy.springboot.registrationlogin.controller;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.dto.RestaurantDto;
import net.enjoy.springboot.registrationlogin.entity.Category;
import net.enjoy.springboot.registrationlogin.entity.Restaurant;
import net.enjoy.springboot.registrationlogin.service.CategoryService;
import net.enjoy.springboot.registrationlogin.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/restaurant")
public class RestaurantControler {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public String see(){
        return "Categories!";
    }

    @GetMapping("/")
    public List<Restaurant> getRestaurant() {
        return restaurantService.listRestaurant();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createRestaurant(@RequestBody RestaurantDto restaurantDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errorMessages = bindingResult.getFieldErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Validation errors: " + errorMessages);
        }
        restaurantService.saveRestaurant(restaurantDto);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Saved successfully!");
    }
}
