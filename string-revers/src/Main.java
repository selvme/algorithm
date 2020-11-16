import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = null;
        while(message == null || message.isEmpty()){
            System.out.print("Введите слова для переворота: ");
            message = scanner.nextLine();
        }
        revers(message);
    }

    private static void revers(String string){
        char[] chars = string.toCharArray();
        for (int i = chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
        System.out.println("\nКонец...");
    }
}
