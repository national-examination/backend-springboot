package net.enjoy.springboot.registrationlogin.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Long id;

    @NotEmpty(message = "Category name should not be empty")
    private String name;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
