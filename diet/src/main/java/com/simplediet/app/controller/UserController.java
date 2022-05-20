package com.simplediet.app.controller;

import com.simplediet.app.model.entity.User;
import com.simplediet.app.model.repository.UserRepository;
import com.simplediet.app.model.service.UserService.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {
    private final UserRepository userRepository;
    private final UserServiceImpl userService;

    @GetMapping("/list")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/add")
    public HttpStatus addUser(@RequestBody @Validated User user) {
        if (!userService.validateEmail(user.getEmail())) {
            log.warn("Email " + user.getEmail() + " is not valid");
        }
        try {
            userRepository.save(user);
            return HttpStatus.OK;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return HttpStatus.BAD_REQUEST;
        }

    }

    @PutMapping("/edit/{id}")
    public HttpStatus editUser(@RequestBody User user, @PathVariable long id) {
        userRepository.findById(id);
        userRepository.save(user);
        return HttpStatus.OK;
    }

    @DeleteMapping("/remove/{id}")
    public HttpStatus removeUser(@PathVariable long id) {
        userRepository.deleteById(id);
        return HttpStatus.OK;
    }

}
