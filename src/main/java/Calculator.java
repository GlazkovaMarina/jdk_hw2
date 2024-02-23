import jdk.jfr.StackTrace;

/*
 Написать класс Калькулятор (необобщенный),
 который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
 Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number, M extends Number> double sum(T first, M second){
        return first.doubleValue() + second.doubleValue();
    }
    public static <T extends Number, M extends Number> double multiply(T first, M second){
        return first.doubleValue() * second.doubleValue();
    }
    public static <T extends Number, M extends Number> double divide(T first, M second){
        if (second.doubleValue() == 0.0){
            System.out.println("Попытка деления на ноль! Возвращен 0!");
            return 0.0;
        }
        return first.doubleValue() / second.doubleValue();
    }
    public static <T extends Number, M extends Number> double subtract(T first, M second){
        return first.doubleValue() - second.doubleValue();
    }
}
