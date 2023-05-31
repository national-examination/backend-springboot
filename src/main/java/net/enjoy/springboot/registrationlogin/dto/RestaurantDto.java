package net.enjoy.springboot.registrationlogin.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.enjoy.springboot.registrationlogin.entity.Category;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDto {
    private Long id;

    @NotEmpty(message = "Name must not be empty")
    private String name;

    @NotEmpty(message = "Location must not be empty")
    private String location;

    @NotEmpty(message = "Items must be an array")
    private String items;

    @NotEmpty(message = "Availability needed!")
    private String available;

    @NotEmpty(message = "Provide your category")
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
