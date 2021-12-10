import java.util.HashMap;
import java.util.Map;

public class DataBase {
    HashMap<String, String> dataBase;

    public DataBase(HashMap<String, String> dataBase) {
        this.dataBase = dataBase;
    }

    public HashMap<String, String> getDataBase() {
        return dataBase;
    }
}
