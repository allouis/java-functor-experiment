package whatever;

import java.util.function.Function;
import java.util.function.Supplier;

public class IO<T> implements Monad<T> {
    private Supplier<T> io;
    public IO(Supplier<T> _io){
        io = _io;
    }
    @Override
    public <R> IO<R> map(Function<T, R> mapFn){
        return new IO<R>(fn.compose(mapFn, io));
    }
    @Override
    public <R> IO<R> flatmap(Function<T, Monad<R>> mapFn) {
    	return (IO<R>) mapFn.apply((T) io);
    }
    public void unsafeRunIO(){
        io.get();
    }
	@Override
	public <B, C> IO<C> ap(Applicative<B> value) {
		return new IO<C>(null);
	}
}
