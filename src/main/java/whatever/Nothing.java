package whatever;

import java.util.function.Function;

public class Nothing<T> extends Maybe<T> {
	public Nothing() {
		super(null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R> Nothing<R> map(Function<T, R> mapFn) {
		return (Nothing<R>) this;
	};
}