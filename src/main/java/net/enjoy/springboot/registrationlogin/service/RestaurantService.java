package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.dto.RestaurantDto;
import net.enjoy.springboot.registrationlogin.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant saveRestaurant(RestaurantDto restaurantDto);
    List<Restaurant> listRestaurant();
}
