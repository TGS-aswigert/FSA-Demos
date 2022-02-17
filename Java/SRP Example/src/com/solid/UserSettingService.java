package com.solid;

public class UserSettingService {
    public void changeEmail(User user, String newEmail) {
        if(checkAccess(user)) {
            user.setEmail(newEmail);
        }
    }

    public boolean checkAccess(User user) {
        return user.isValid;
    }
}
