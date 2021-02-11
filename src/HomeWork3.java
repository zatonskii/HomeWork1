import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    private static Random random = new Random();
    public static void main(String[] args) {
        guessNumber();
    }

    /**
     * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     **/
    private static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = random.nextInt(10);
            System.out.println("Угдайте число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите ваше число:");
                int questionNum = scanner.nextInt();
                if (questionNum == numComp) {
                    System.out.println("Вы угадали! Отлично!");
                    break;
                }
                System.out.println(questionNum > numComp ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " у вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
        }
        while (scanner.nextInt() == 1);

    }
}
   /**
 сорян, что не вышло загрузить файл с первого раза
     **/
