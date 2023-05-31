package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.dto.RestaurantDto;
import net.enjoy.springboot.registrationlogin.entity.Category;
import net.enjoy.springboot.registrationlogin.entity.Restaurant;
import net.enjoy.springboot.registrationlogin.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService{
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant saveRestaurant(RestaurantDto restaurantDto){

        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurantDto.getName());
        restaurant.setAvailable(restaurantDto.getAvailable());
        restaurant.setCategory(restaurantDto.getCategory());
        restaurant.setItems(restaurantDto.getItems());
        restaurant.setLocation(restaurantDto.getLocation());

        Restaurant newRestaurant = restaurantRepository.save(restaurant);
        return newRestaurant;
    }

    @Override
    public List<Restaurant> listRestaurant(){
        return restaurantRepository.findAll();
    }
}
