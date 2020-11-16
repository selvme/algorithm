import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        while(true) {
            System.out.print("Введите число: ");
            num = scanner.nextLine();
            if (num.matches("^\\d+$")){
                break;
            }
        }
        System.out.println(fibonachi(Integer.parseInt(num)));
    }

    private static int fibonachi(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }
        return fibonachi(num-1) + fibonachi(num-2);
    }
}
