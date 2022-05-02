import java.util.Scanner;

public class Main {
    public double trapezeIntegration(Calculator calculator, double bottomEdge, double topEdge, int stepCount) {
        double step = (topEdge - bottomEdge) / stepCount;
        double square = 0;
        for (int i = 0; i < stepCount - 1; i++){
            double x = bottomEdge + step * i;
            double Si = (step*(calculator.func((x + step)) + calculator.func(x)) / 2);
            square += Si;
        }
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Main integral = new Main();
        double bottomEdge = scanner.nextDouble();
        double topEdge = scanner.nextDouble();
        int stepCount = scanner.nextInt();
        System.out.println(integral.trapezeIntegration(calculator, bottomEdge, topEdge, stepCount));
    }
}
