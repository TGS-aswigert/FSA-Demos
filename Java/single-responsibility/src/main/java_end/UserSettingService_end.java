public class UserSettingService_end {
    public void changeEmail(User_end user, String newEmail) {
        if(SecurityService_end.checkAccess(user)) {
            user.setEmail(newEmail);
        }
    }
}
