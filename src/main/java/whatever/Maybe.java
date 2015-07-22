package whatever;

import java.util.function.Function;

public class Maybe<T> implements Functor<T> {
	protected T val;
	public Maybe(T _val) {
		val = _val;
	}
	@Override
	public <R> Maybe<R> map(Function<T, R> mapFn) {
		if (val == null) {
			return nothing();
		} else {
			return new Maybe<R>(mapFn.apply(val));
		}
	}
	public static <T> Just<T> just(T value) {
		return new Just<T>(value);
	}
	public static <T> Nothing<T> nothing() {
		return new Nothing<T>();
	}
}
