package whatever;

import java.util.function.Function;

public class Just<T> extends Maybe<T> {
	public Just(T _val) {
		super(_val);
	}
	@Override
	public <R> Just<R> map(Function<T, R> mapFn) {
		return new Just<R>(mapFn.apply(val));
	}
}