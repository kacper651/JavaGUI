import java.util.HashMap;

public class UserRepository {
    HashMap<String, User> dataBase;

    public UserRepository() {
        this.dataBase = new HashMap<>();
        this.initializeUserRepo();
    }
    private void initializeUserRepo(){
        dataBase.put("Kacper", new User("Kacper", "123"));
        dataBase.put("Jan", new User("Jan", "123"));
        dataBase.put("Marek", new User("Marek", "123"));
        dataBase.put("Tomasz", new User("Tomasz", "123"));
        dataBase.put("Borys", new User("Borys", "123"));
    }
    public User getUserByUsername(String username){
        return this.dataBase.get(username);
    }
}
