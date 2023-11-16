import java.util.Random;

public class Monty {
    static Random rnd = new Random();
    private static int[] doors;                 // массив пронумерованых дверей
    private static int playerChoice;            // номер двери выбраной игроком
    private static int hostChoice;              // номер двери открытой ведущим

    private static void play() {
        doors = new int[]{0, 0, 0};              // начальное состояние трех дверей под номерами 0, 1, 2
        doors[rnd.nextInt(3)] = 1;         // помещаем автомобиль за случайную дверь
        playerChoice = rnd.nextInt(3);     // игрок делает случайный выбор двери
        do {
            hostChoice = rnd.nextInt(3);                        // ведущий открывает дверь, за которой коза
        } while (doors[hostChoice] == 1 || hostChoice == playerChoice);// и это не дверь выбраная игроком
    }

    public static boolean playerStand() {
        play();
        return doors[playerChoice] == 1;
    }

    public static boolean playerChange() {
        play();
        return doors[3 - playerChoice - hostChoice] == 1;
    }
}
