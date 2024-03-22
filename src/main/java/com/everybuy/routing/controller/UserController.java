package com.everybuy.routing.controller;

import com.everybuy.buisnesslogic.service.UserService;
import com.everybuy.database.entity.User;
import com.everybuy.routing.model.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/get-all")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsersDTO();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);

    }
}
