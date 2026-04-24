package com.example.login_project1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void validLogin() {
        assertEquals("Login Successful",
                LoginService.login("admin", "1234"));
    }

    @Test
    void invalidPassword() {
        assertEquals("Invalid Credentials",
                LoginService.login("admin", "wrong"));
    }

    @Test
    void invalidUsername() {
        assertEquals("Invalid Credentials",
                LoginService.login("user", "1234"));
    }

    @Test
    void emptyFields() {
        assertEquals("Invalid Credentials",
                LoginService.login("", ""));
    }
}
