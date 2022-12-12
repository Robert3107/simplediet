package com.simplediet.app.controller;

import com.simplediet.app.model.entity.User;
import com.simplediet.app.repository.UserRepository;
import com.simplediet.app.service.UserService.UserDataOperations;
import com.simplediet.app.service.UserService.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {
    private final UserRepository userRepository;
    private final UserServiceImpl userService;
    private final UserDataOperations userOperations;

    @GetMapping("/list")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/add")
    public HttpStatus addUser(@RequestBody User user) {
        try {
            if (Objects.isNull(userRepository.findByEmail(user.getEmail()))) {
                userOperations.userFormatter(user);
                userRepository.save(user);
                return HttpStatus.OK;
            } else log.warn("The user with the specified e-mail address already exists");
            return HttpStatus.NOT_ACCEPTABLE;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.BAD_REQUEST;
        }
    }

    @PutMapping("/edit/{id}")
    public HttpStatus editUser(@RequestBody User user, @PathVariable long id) {
        try {
            userRepository.findById(id);
            userRepository.save(user);
            return HttpStatus.OK;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            log.warn("Not found user with %s id", id);
            return HttpStatus.NOT_FOUND;
        }
    }

    @DeleteMapping("/remove/{id}")
    public HttpStatus removeUser(@PathVariable long id) {
        try {
            userRepository.deleteById(id);
            return HttpStatus.OK;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            log.warn("Not found user with %s id", id);
            return HttpStatus.NOT_FOUND;
        }
    }

}
