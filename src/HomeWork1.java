public class HomeWork1 {
    public static void main(String args[]) {
        //        2. Создать переменные все
//х пройденных типов данных и инициализировать их значения.
        System.out.println("Задание 1.");
        boolean b = false;
        byte bt = 0;
        char c = 'x';
        short s = 123;
        int i = 777;
        long l = 77777L;
        float f = 777.0f;
        double d = 777.777;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
        System.out.println(calc(2, 3, 4, 5));
        wThree ();
        isPositiveOrNegative (0);
        isNegative (0);
    }

    //        3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//                где a, b, c, d – аргументы этого метода, имеющие тип float.
    static int calc(int a, int b, int c, int d) {
        System.out.println("Задание 2.");
        return a * (b + (c / d));
    }


    //    4.Написать метод,принимающий на вход два целых числа и проверяющий,
//            что их сумма лежит в пределах от 10до 20(включительно),
//            если да – вернуть true,в противном случае – false.
    public static void wThree() {
        System.out.println("Задание 3.");
        int a;
        int b;
        int c;
        a = 3;
        System.out.println("a = " + a);
        b = 5;
        System.out.println("b = " + b);
        c = a + b;
        System.out.println("c = " + c);
        if (c > 10 && c < 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false!");
        }
    }
//
//    Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.
//
    public static void isPositiveOrNegative(int x) {
        System.out.println("Задание 4.");
        if(x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }
//    Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное,
//    и вернуть false если положительное.
    public static boolean isNegative(int x) {
        System.out.println("Задание 5.");
        if(x < 0) {
            return true;
        }
        return false;
}
}







