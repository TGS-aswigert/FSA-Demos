package com.solid.finished;

public class SecurityService {
    public static boolean checkAccess(User user) {
        return user.isValid;
    }
}
