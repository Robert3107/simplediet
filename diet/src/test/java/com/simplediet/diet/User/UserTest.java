package com.simplediet.diet.User;

import com.simplediet.app.model.service.UserService.UserDataOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {
    UserDataOperations userOperations = new UserDataOperations();

    @ParameterizedTest
    @ValueSource(strings = {"abc@gmail.pl",
            "jan@kowal.com",
            "explore101@hotmail.red",
            "antgatsj4zt@nkgursr.com",
            "bobbbie@suttal.com"})
    public void validateEmailTest(String email) {
        String notValidEmail = "abc@abc";
        Assertions.assertTrue(userOperations.validateEmail(email));
        Assertions.assertFalse(userOperations.validateEmail(notValidEmail));
    }

}
