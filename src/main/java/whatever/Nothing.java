package whatever;

import java.util.function.Function;

public class Nothing<T> extends Maybe<T> {
	public Nothing() {
		super(null);
	}

	@Override
	public <R> Nothing<T> map(Function<? super T, ? extends R> mapFn) {
		return this;
	};
}