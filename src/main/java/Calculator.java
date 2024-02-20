import jdk.jfr.StackTrace;

/*
 Написать класс Калькулятор (необобщенный),
 который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
 Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number, M extends Number> Number sum(T first, M second){
        return new Number() {
            @Override
            public int intValue() {
                return first.intValue() + second.intValue();
            }
            @Override
            public long longValue() {
                return first.longValue() + second.longValue();
            }
            @Override
            public float floatValue() {
                return first.floatValue() + second.floatValue();
            }
            @Override
            public double doubleValue() {
                return first.doubleValue() + second.doubleValue();
            }
        };
    }
    public static <T extends Number, M extends Number> Number multiply(T first, M second){
        return new Number() {
            @Override
            public int intValue() {
                return first.intValue() * second.intValue();
            }
            @Override
            public long longValue() {
                return first.longValue() * second.longValue();
            }
            @Override
            public float floatValue() {
                return first.floatValue() * second.floatValue();
            }
            @Override
            public double doubleValue() {
                return first.doubleValue() * second.doubleValue();
            }
        };
    }
    public static <T extends Number, M extends Number> Number divide(T first, M second){
        return new Number() {
            @Override
            public int intValue() {
                try{
                    return first.intValue() / second.intValue();
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
                return 0;
            }

            @Override
            public long longValue() {
                return first.longValue() / second.longValue();
            }

            @Override
            public float floatValue() {
                return first.floatValue() / second.floatValue();
            }

            @Override
            public double doubleValue() {
                return first.doubleValue() / second.doubleValue();
            }
        };
    }
    public static <T extends Number, M extends Number> Number subtract(T first, M second){
        return new Number() {
            @Override
            public int intValue() {
                return first.intValue() - second.intValue();
            }
            @Override
            public long longValue() {
                return first.longValue() - second.longValue();
            }
            @Override
            public float floatValue() {
                return first.floatValue() - second.floatValue();
            }
            @Override
            public double doubleValue() {
                return first.doubleValue() - second.doubleValue();
            }
        };
    }
}
