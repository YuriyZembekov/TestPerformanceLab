package daythree.taskone;

import java.util.Objects;

/*
Реализуйте класс Pair, который позволяет хранить 2 объекта строго определенных типов.
Реализуйте методы getFirst, getSecond, equals и hashcode (в соответствии с требованием их согласованности).
Нижеприведенный код должен компилироваться и работать.
Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); //-> 1
String s = pair.getSecond(); //-> "hello"
Pair<Integer, String> pair2 = Pair.of(1, "hello");
Pair<Integer, String> pairWithNull = Pair.of(1, null);
pair1.equals(parir2); //-> true
pair1.equals(pairWithNull); //-> false
 */
public class Pair<T, R> {
    private T firstValue;
    private R secondValue;

    private Pair(T firstValue, R secondValue){
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        //ArrayList
    }
    public static <T, R>  Pair<T, R> of(T firstValue, R secondValue){
        return new Pair<>(firstValue, secondValue);
    }

    public T getFirst(){
        return firstValue;
    }
    public R getSecond(){
        return secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getFirst(), pair.getFirst()) &&
                Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }
}
