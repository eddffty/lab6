import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            System.out.println("Ошибка: имя не может быть пустым!");
            scanner.close();
            return;
        }

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        greetUser(name, age);

        scanner.close();

        System.out.println("Подготовка к объединению веток");
    }

    static void greetUser(String name, int age) {
        System.out.println("Привет, " + name);
        System.out.println("Тебе " + age + " лет.");
    }
}