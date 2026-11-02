import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        greetUser(name);

        scanner.close();
    }

    static void greetUser(String name) {
        if (name.isBlank()) {
            System.out.println("Ошибка: имя не может быть пустым!");
            return;
        }

        System.out.println("Привет, " + name);
    }
}