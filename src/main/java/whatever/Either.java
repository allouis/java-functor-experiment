package whatever;

import java.util.function.Function;

class Left<T> {
    private T val;
    public Left(T _val) {
        val = _val;
    }
    public Left<T> map(Function<?, ?> mapFn) {
        return this; 
    }
}
