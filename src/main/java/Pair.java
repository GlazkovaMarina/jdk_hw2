/*
3 Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.
*/
public class Pair <T, M> {
    private T first;
    private M second;
    public Pair(T first, M second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public M getSecond(){
        return second;
    }
    @Override
    public String toString() {
        return "[" + first.toString() + ": " + second.toString() + "]";
    }
}
