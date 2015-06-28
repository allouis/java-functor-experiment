package whatever;

import java.util.function.Function;

public class Maybe<T> implements Functor<T> {
	protected T val;
	public Maybe(T _val) {
		val = _val;
	};
	@Override
	public <R> Maybe<?> map(Function<? super T, ? extends R> mapFn) {
		if (val == null) {
			return this;
		} else {
			return new Maybe<>(mapFn.apply(val));
		}
	}
}