public class AuthenticationService {
    private final UserRepository userRepo;

    public AuthenticationService() {
        this.userRepo = new UserRepository();
    }

    public Boolean logInUser(String username, String password) {
        User user = this.userRepo.getUserByUsername(username);
        return user != null && user.password.equals(password);
    }
}
