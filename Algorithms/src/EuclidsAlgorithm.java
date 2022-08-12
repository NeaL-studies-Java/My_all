import java.util.Scanner;


public class EuclidsAlgorithm {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        int result = calc (num1, num2);
        System.out.println("Наибольший общий дельтель чисел " + num1 + " и " + num2 + " равен: " + result);

    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static int calc(int num1, int num2){
        int result;
        while (num2 != 0) {
            int tmp = num1%num2;
            num1 = num2;
            num2 = tmp;
        }
        result = num1;
        return result;
    }


}
