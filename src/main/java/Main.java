public class Main {
    public static void main(String[] args) {
        System.out.print("Если игрок не меняет своего решения ");
        Printer.printWinStatistic(Saver.saveStandResult());
        System.out.println();
        System.out.print("Если игрок меняет свое решение ");
        Printer.printWinStatistic(Saver.saveChangeResult());
    }
}
