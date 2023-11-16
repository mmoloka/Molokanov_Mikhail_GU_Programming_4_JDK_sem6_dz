import java.util.HashMap;
import java.util.Map;

public class Printer {

    public static void printWinStatistic(HashMap<Integer, Boolean> result) {
        float percentWin;
        int numberWin = 0;
        for (Map.Entry<Integer, Boolean> entry : result.entrySet()) {
            if (entry.getValue()) numberWin++;
        }
        percentWin = (float) (numberWin * 100) / result.size();

        System.out.printf("cтатистика побед: %.0f %%", percentWin);
    }
}
