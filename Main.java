import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name);
        scanner.close();
    }
}