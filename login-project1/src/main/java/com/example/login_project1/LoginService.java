package com.example.login_project1;

public class LoginService {

    public static String login(String username, String password) {
        if ("admin".equals(username) && "1234".equals(password)) {
            return "Login Successful";
        } else {
            return "Invalid Credentials";
        }
    }
}
