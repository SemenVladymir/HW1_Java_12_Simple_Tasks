import java.sql.Array;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 1,  (text position)");
//        Выведите на экран надпись "Your time is limited, so
//        don’t waste it living someone else’s life" Steve Jobs на разных
//        строках. Пример вывода:
//           “Your time is limited,
//               so don’t waste it
//                  living someone else’s life”
//                      Steve Jobs
        System.out.println("Your time is limited, so\n\tdon’t waste it\n" +
                "\t\tliving someone else’s life\"\n\t\t\tSteve Jobs");


        //Task 2
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 2,  (percent calculate)");
//        Пользователь вводит с клавиатуры два числа. Первое
//        число — это значение, второе число процент, который
//        необходимо посчитать. Например, мы ввели с клавиатуры
//        50 и 10. Требуется вывести на экран 10 процентов от 50.
//        Результат: 5
        System.out.print("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Enter number of percent:");
        int b = scanner.nextInt();
        System.out.println(b+" percent of "+a+" is equal to " + (String.valueOf( a * b/100)));


        //Task 3
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 3,   (combining numbers)");
//        Пользователь вводит с клавиатуры три цифры. Необ-
//        ходимо создать число, содержащее эти цифры. Например,
//        если с клавиатуры введено 7, 3, 8, тогда нужно сформи-
//        ровать число 738.
        System.out.print("Enter first number:");
        String fn = scanner.next();
        System.out.print("Enter second number:");
        String sn = scanner.next();
        System.out.print("Enter third number:");
        String tn = scanner.next();
        System.out.println("Equal number is " + (String.valueOf( fn+sn+tn)));


        //Task 4
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 4,   (rotate some digits of number");
//        Пользователь вводит шестизначное число. Необходимо
//        поменять в этом числе первую и шестую цифры, а также
//        вторую и пятую цифры.
//        Например, 723895 должно превратиться в 593827.
//        Если пользователь ввел не шестизначное число тре-
//        буется вывести сообщение об ошибке.
        System.out.print("Enter number with 6 digits:");
        int sdn = scanner.nextInt();
        if (sdn > 999999 || sdn <100000) System.out.print("You entered the wrong number!");
        else {
            int frn = sdn / 100000 + (sdn / 10000 % 10) * 10 ;
            int lsn = sdn % 10 * 100000 + (sdn % 100 - sdn % 10) * 1000;
            int corn = sdn / 100 % 100;
            int ln = lsn + corn * 100 + frn;
            System.out.println("Outer number: " + ln);
        }


        //Task 5
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 5,  (take name of season from number of month)");
//        Пользователь вводит с клавиатуры номер месяца (от
//        1 до 12). В зависимости от полученного номера месяца
//        программа выводит на экран надпись: Winter (если введено
//        значение 1,2 или 12), Spring (если введено значение от 3
//        до 5), Summer (если введено значение от 6 до 8), Autumn
//        (если введено значение от 9 до 11).
//        Если пользователь ввел значение не в диапазоне от 1
//        до 12 требуется вывести сообщение об ошибке.
        System.out.print("Enter number from 1 to 12: ");
        int mn = scanner.nextInt();
        if (mn > 12 || mn <1) System.out.print("You entered the wrong number!");
        else {
            if(mn==1 || mn==2 || mn==12) System.out.println("-Winter-");
            else if(mn>2 && mn<6) System.out.println("-Spring-");
            else if(mn>5 && mn<9) System.out.println("-Summer-");
            else System.out.println("-Autumn-");
        }


        //Task 6
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 6,   (convert meters to miles, inches or yards)");
//        Пользователь вводит с клавиатуры количество ме-
//        тров. В зависимости от выбора пользователя программа
//        переводит метры в мили, дюймы или ярды.
        System.out.print("Enter number of meters: ");
        mn = scanner.nextInt();
        System.out.print("\nChoose number from 1 to 3 for convert meters to:\n1) miles;\n2) inches;\n3) yards\n");
        int n = scanner.nextInt();
        if (n > 0 && n <4 && mn > 0){
            switch (n){
                case 1:
                   System.out.println(mn + " meters convert to " + (mn * 621.371) + " miles ");
                   break;
                case 2:
                    System.out.println(mn + " meters convert to " + (mn * 39.3701) + " inches ");
                    break;
                case 3:
                    System.out.println(mn + " meters convert to " + (mn * 1.09361) + " yards ");
                    break;
            }
        }


        //Task 7
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 7,   (show odd numbers of range");
//        Пользователь вводит с клавиатуры два числа. Нужно
//        показать все нечетные числа в указанном диапазоне. Если
//        границы диапазона указаны неправильно требуется про
//        извести нормализацию границ. Например, пользователь
//        ввел 20 и 11, требуется нормализация, после которой
//        начало диапазона станет равно 11, а конец 20.
        System.out.print("Enter first number:");
        a = scanner.nextInt();
        System.out.print("Enter second number:");
        b = scanner.nextInt();
        if (a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i =a; i < b; i++){
            if (i % 2 > 0) System.out.print(i + "; ");
        }


        //Task 8
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 8,   (show multiplication table between two numbers)");
//        Показать на экран таблицу умножения в диапазоне,
//        указанном пользователем. Например, если пользователь
//        указал 3 и 5, таблица может выглядеть так:
//        3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
//……………………………………………………
//        5*1 = 5 5 *2 = 10 5 *3 = 15 ………….
        System.out.print("Enter first number:");
        a = scanner.nextInt();
        System.out.print("Enter second number (bigger then first):");
        b = scanner.nextInt();
        if (a < b){
            for (int i = a; i <= b; i++){
                for (int j = 1; j <= 10; j++){
                    System.out.print(i + " * " + j + " = " + i*j + ", ");
                }
                System.out.println();
            }
        }


        //Task 9
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 9,  (work with array: min., max., negative and positive numbers)");
//        В одномерном массиве, заполненном случайными
//        числами, определить минимальный и максимальный
//        элементы, посчитать количество отрицательных эле-
//        ментов, посчитать количество положительных элемен-
//        тов, посчитать количество нулей. Результаты вывести
//        на экран.
        System.out.println("Random filled array");
        int [] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i]  = (int) (Math.random()*(20+1)) - 10;
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
        int [] max = {0, 0};
        int [] min = {0, 10};
        int counneg = 0;
        int counpos = 0;
        int countzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max[1]) {
                max[1] = arr[i];
                max[0] = i;
            }
            if(arr[i] < min[1]) {
                min[1] = arr[i];
                min[0] = i;
            }
            if(arr[i] < 0)
                counneg++;
            if(arr[i] > 0)
                counpos++;
            if(arr[i] == 0)
                countzero++;
        }
        System.out.println("Maximal number in array is - " + max[1] + " in position " + (max[0]+1));
        System.out.println("Minimal number in array is - " + min[1] + " in position " + (min[0]+1));
        System.out.println("Number of negative numbers in array is - " + counneg);
        System.out.println("Number of positive numbers in array is - " + counpos);
        System.out.println("Number of zero numbers in array is - " + countzero);


        //Task 10
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 10,   (make new arrays from the first");
//        Есть одномерный массив, заполненный случайными
//        числами. На основании данных этого массива нужно:
//        ■ Создать одномерный массив, содержащий только
//        четные числа из первого массива;
//        ■ Создать одномерный массив, содержащий только
//        нечетные числа из первого массива;
//        ■ Создать одномерный массив, содержащий только
//        отрицательные числа из первого массива;
//        ■ Создать одномерный массив, содержащий только
//        положительные числа из первого массива.
        System.out.println("Random filled array");
        int [] arr2 = new int[20];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i]  = (int) (Math.random()*(20+1)) - 10;
            System.out.print(arr2[i] + "; ");
        }
        System.out.println();

        int [] even = new int[0];   //Массив четных чисел
        int [] odd = new int[0];    //Массив нечетных чисел
        int [] posnum = new int[0]; //Массив положительных чисел
        int [] negnum = new int[0]; //Массив отрицательных чисел
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2==0) even = stretchingArray(even, arr2[i]);
            else odd = stretchingArray(odd, arr2[i]);

            if(arr2[i] > 0) posnum = stretchingArray(posnum, arr2[i]);
            else negnum = stretchingArray(negnum, arr2[i]);
        }
        System.out.println("Array of even numbers:");
        printArray(even);
        System.out.println("Array of odd numbers:");
        printArray(odd);
        System.out.println("Array of positive numbers:");
        printArray(posnum);
        System.out.println("Array of negative numbers:");
        printArray(negnum);


        //Task 11
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 11,   (show horizontal or vertical line from entered symbol)");
//        Напишите метод, который отображает горизонталь-
//        ную или вертикальную линию из некоторого символа.
//        Метод принимает в качестве параметра: длину линии,
//        направление, символ.
        System.out.print("Enter symbol: ");
        String symb = scanner.next();
        System.out.print("Enter number of symbols: ");
        int numsymb = scanner.nextInt();
        System.out.print("Enter number 0 for horizontal or 1 for vertical direction: ");
        int direc = scanner.nextInt();
        printLine(symb, numsymb, direc);


        //Task 12
        System.out.println("\n----------------------------------------------");
        System.out.println("Task 12,   (make method of array sorting)");
//        Напишите метод, сортирующий массив по убыванию
//        или возрастанию в зависимости от выбора пользователя.
        System.out.print("Enter size of array:");
        a = scanner.nextInt();
        System.out.print("Enter number 0 for array sort ascending or 1 for array sort descending: ");
        direc = scanner.nextInt();
        arr = new int[a];

        for (int i = 0; i < arr.length; i++)
            arr[i]  = (int) (Math.random()*(20+1)) - 10;
        System.out.println("Array before sorting:");
        printArray(arr);
        switch (direc){
            case 0:
                sortArray(arr, true);
                break;
            case 1:
                sortArray(arr, false);
        }
        System.out.println("Array after sorting:");
        printArray(arr);
    }


    static int[] stretchingArray (int[]inp, int num) {
        int [] tmp;
        if (inp==null || inp.length==0) {
            tmp = new int []{num};
        }
        else {
        tmp = new int[inp.length + 1];
        System.arraycopy(inp, 0, tmp, 0, inp.length);
        tmp[inp.length] = num;
        }
        return tmp;
    }

    static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "; ");
        System.out.println();
    }

    static void printLine(String symb, int leng, int direc){
        switch (direc){
            case 0:
                for (int i = 0; i < leng; i++)
                    System.out.print(symb);
                break;
            case 1:
                for (int i = 0; i < leng; i++)
                    System.out.println(symb);
                break;
        }
    }

    static int [] sortArray(int[] arr, boolean type){
        int [] tmp = new int[arr.length];
        int num;
        if(type){
            for (int i = arr.length; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        num = arr[j];
				        arr[j] = arr[j - 1];
				        arr[j - 1] = num;
                    }
                }
            }
        }
        else {
            for (int i = arr.length; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    if (arr[j - 1] < arr[j]) {
                        num = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = num;
                    }
                }
            }
        }
        return tmp;
    }
}