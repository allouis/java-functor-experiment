package whatever;

import java.util.function.Function;

public interface Functor<T> {
	<R> Functor<?> map(Function<? super T, ? extends R> mapFn);
};