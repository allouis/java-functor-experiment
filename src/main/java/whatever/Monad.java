package whatever;

import java.util.function.Function;

public interface Monad<T> extends Applicative<T> {
    public <R> Monad<R> flatmap(Function<T, Monad<R>> mapFn);
}
