package com.simplediet.app.controller;

import com.simplediet.app.model.entity.User;
import com.simplediet.app.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/list")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/add")
    public HttpStatus addUser(@RequestBody User user) {
        userRepository.save(user);
        return HttpStatus.OK;
    }

    @PutMapping("/edit")
    public HttpStatus editUser(@RequestBody User user) {
        userRepository.findById(user.getId());
        userRepository.save(user);
        return HttpStatus.OK;
    }

    @DeleteMapping("/remove/{id}")
    public HttpStatus removeUser(@PathVariable long id) {
        userRepository.deleteById(id);
        return HttpStatus.OK;
    }

}
