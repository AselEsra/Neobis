package com.example.dbmigrationflyway.Cafe.registration;

import com.example.dbmigrationflyway.Cafe.user.User;
import com.example.dbmigrationflyway.Cafe.user.UserRole;
import com.example.dbmigrationflyway.Cafe.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegistrationService {

    private final UserService userService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail){
            throw new IllegalStateException("email is not valid");
        }
        return userService.signUp(new User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                UserRole.USER
        ));
    }
}
