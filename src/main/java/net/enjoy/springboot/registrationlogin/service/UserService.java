package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.UserDto;
import net.enjoy.springboot.registrationlogin.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    void saveUser(UserDto userDto);

    User loginUser(String email, String password);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}