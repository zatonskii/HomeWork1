public class HomeWork2 {
    public static void main(String args[]) {
        invertArray();
        fillArray ();
        changeArray();
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     **/
    static void invertArray() {
        System.out.println("\n Задание-1");
        int[] doOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < doOne.length; i++) {
            doOne[i] = doOne[i] == 1 ? 0 : 1;
            System.out.print(doOne[i] + " ");
        }
    }
/**
 Задать пустой целочисленный массив размером 8.
 С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 **/
    static void fillArray() {
        System.out.println("\n Задание-2");
        int[] doTwo = new int[8];
        for (int q = 1, w = 0; q < doTwo.length; q++) doTwo[q] = w += 3;
        for (int e : doTwo) System.out.print(e + " ");
    }
/**
 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 пройти по нему циклом, и числа меньшие 6 умножить на 2;
 **/
    public static void changeArray() {
        System.out.println("\n Задание-3");
        int[] doThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int v = 0; v < doThree.length; v++) {
            if (doThree[v] < 6) doThree[v] *= 2;
            System.out.print(doThree[v] + " ");
        }
    }
/**
 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
**/
    public static void fillDiagonal() {
        System.out.println("\n Задание-4");
        int[][] foFour = new int[7][7];
        for (int i = 0; i < foFour.length; i++) {
            for (int j = 0, j2 = foFour[i].length; j < foFour[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) foFour[i][j] = 1;
                System.out.print(foFour[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}