package uz.doston.dtoentitymapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.doston.dtoentitymapper.dtoMapper.UserDto;
import uz.doston.dtoentitymapper.dtoMapper.UserMapper;
import uz.doston.dtoentitymapper.model.User;
import uz.doston.dtoentitymapper.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @GetMapping("/user/{id}")
    public UserDto findById(@PathVariable("id") Long id){
        return UserMapper.toUserDto(userService.findById(id));
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id")Long id){
        userService.deleteById(id);
    }

    @GetMapping("/user/all")
    public List<User>findAll(){
        return userService.getAll();
    }



}
