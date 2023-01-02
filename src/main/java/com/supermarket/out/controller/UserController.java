package com.supermarket.out.controller;

import com.supermarket.out.dto.UserDTO;
import com.supermarket.out.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserById/{userId}")
    public UserDTO getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/getUserByUserIdAndAddress/{userId}//{address}")
    public UserDTO getUserByUserIdAndAddress(@PathVariable String userId, String address) {
        return userService.getUserByUserIdAndAddress(userId, address);
    }
}