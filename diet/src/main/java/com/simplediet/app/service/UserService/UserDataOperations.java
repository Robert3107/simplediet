package com.simplediet.app.service.UserService;

import com.simplediet.app.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class UserDataOperations {

    private final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    public void userFormatter(User user) {
        if (validateEmail(user.getEmail())) {
            user.setName(user.getName().toUpperCase().charAt(0) + user.getName().substring(1));
            user.setSurname(user.getSurname().toUpperCase().charAt(0) + user.getSurname().substring(1));
        }
    }
}
