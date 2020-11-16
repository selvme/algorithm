import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        while (true){
            System.out.print("Введите число для вычисления факториала: ");
            message = scanner.nextLine();
            if (message.matches("^\\d+$")){
                break;
            }
        }
        System.out.println(factorial(Integer.parseInt(message)));
    }

    private static int factorial(int digit){
        if (digit == 1){
            return 1;
        }
        return digit * factorial(digit-1);
    }
}
