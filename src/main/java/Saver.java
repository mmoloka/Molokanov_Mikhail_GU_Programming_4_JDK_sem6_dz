import java.util.HashMap;

public class Saver {
    static HashMap<Integer, Boolean> result = new HashMap<>();

    public static HashMap<Integer, Boolean> saveStandResult() {
        result.clear();
        for (int i = 0; i < 1000; i++) {
            boolean standResult = Monty.playerStand();
            result.put(i, standResult);
        }
        return result;
    }

    public static HashMap<Integer, Boolean> saveChangeResult() {
        result.clear();
        for (int i = 0; i < 1000; i++) {
            boolean standResult = Monty.playerChange();
            result.put(i, standResult);
        }
        return result;
    }
}
