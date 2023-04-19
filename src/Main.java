import java.util.Scanner;

public class Main {
    // Метод для численного интегрирования методом трапеций
    public double trapezeIntegration(Calculator calculator, double bottomEdge, double topEdge, int stepCount) {
        // Вычисление длины шага
        double step = (topEdge - bottomEdge) / stepCount;
        double square = 0;
        // Проходимся по всем отрезкам интегрирования
        for (int i = 0; i < stepCount - 1; i++){
            // Находим значение функции на левой и правой границах отрезка
            double x = bottomEdge + step * i;
            // Вычисляем площадь трапеции
            double Si = (step*(calculator.func((x + step)) + calculator.func(x)) / 2);
            // Добавляем площадь трапеции к общей площади
            square += Si;
        }
        // Возвращаем результат интегрирования
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаем экземпляр калькулятора
        Calculator calculator = new Calculator();
        // Создаем экземпляр класса Main
        Main integral = new Main();
        // Считываем данные для интегрирования с консоли
        System.out.print("Введите нижнюю границу интегрирования: ");
        double bottomEdge = scanner.nextDouble();
        System.out.print("Введите верхнюю границу интегрирования: ");
        double topEdge = scanner.nextDouble();
        System.out.print("Введите количество шагов разбиения: ");
        int stepCount = scanner.nextInt();
        // Вычисляем интеграл методом трапеций и выводим результат
        System.out.println("Результат интегрирования: " + integral.trapezeIntegration(calculator, bottomEdge, topEdge, stepCount));
    }
}