# **Вычисление интеграла методом трапеций**

Данный код вычисляет определенный интеграл функции методом трапеций.

## **Файлы**
* **'Main.java'**: основной класс, содержащий метод **'trapezeIntegration'**, осуществляющий численное интегрирование 
методом трапеций, и метод **'main'**, запускающий программу.
* **'Calculator.java'**: класс, содержащий метод **'func'**, вычисляющий значение функции в точке.
* **'README.md'**: файл, который вы читаете сейчас.

## **Использование**
Введите в консоли нижнюю и верхнюю границы интегрирования и количество шагов разбиения. Программа выведет результат вычисления определенного интеграла.

```Пример:
Введите нижнюю границу интегрирования: 0
Введите верхнюю границу интегрирования: 3
Введите количество шагов разбиения: 100
Результат интегрирования: 8.733136499999999
```

## **Описание алгоритма**
Алгоритм численного интегрирования методом трапеций заключается в аппроксимации площади под графиком функции на 
заданном отрезке с помощью трапеций. Интеграл вычисляется по формуле S = h/2 * (f(a) + f(b) + 2 * sum(f(x_i))), 
где h - длина шага, a и b - границы отрезка интегрирования, f(x_i) - значение функции на отрезке [x_i, x_i+1], 
разбитом на шаги. В данной реализации интеграл вычисляется на заданном отрезке с помощью указанного количества шагов.