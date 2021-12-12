import java.util.HashMap;

public class UserRepository {
    HashMap<String, User> dataBase;

    public UserRepository() {
        this.dataBase = new HashMap<>();
        this.initializeUserRepo();
    }
    private void initializeUserRepo(){
        dataBase.put("Kacper", new User("Kacper", "123"));
        dataBase.put("Jan", new User("Jan", "12345"));
        dataBase.put("Marek", new User("Marek", "6273582ws"));
        dataBase.put("Tomasz", new User("Tomasz", "Shshqwe123"));
        dataBase.put("Borys", new User("Borys", "HshshsSH"));
    }
    public User getUserByUsername(String username){
        return this.dataBase.get(username);
    }
}
