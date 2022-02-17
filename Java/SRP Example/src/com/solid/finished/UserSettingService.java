package com.solid.finished;

public class UserSettingService {
    public void changeEmail(User user, String newEmail) {
        if(SecurityService.checkAccess(user)) {
            user.setEmail(newEmail);
        }
    }
}
