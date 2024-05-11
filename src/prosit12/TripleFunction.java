package prosit12;

public interface TripleFunction<T, K, U, V> {

    V convert(T id, K age, U name);
}
