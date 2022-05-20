package com.simplediet.diet.User;

import com.simplediet.app.model.service.UserService.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {

    @ParameterizedTest
    @ValueSource(strings = {"abc@gmail.pl",
            "jan@kowal.com",
            "explore101@hotmail.red",
            "antgatsj4zt@nkgursr.com",
            "bobbbie@suttal.com"})
    public void validateEmailTest(String email) {
        String notValidEmail = "abc@abc";
        UserServiceImpl validateEmailMethod = new UserServiceImpl();
        Assertions.assertTrue(validateEmailMethod.validateEmail(email));
        Assertions.assertFalse(validateEmailMethod.validateEmail(notValidEmail));
    }
}
