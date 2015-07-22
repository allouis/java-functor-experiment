package whatever;

public interface Applicative<T> extends Functor<T> {
    public <B, C> Applicative<C> ap(Applicative<B> value);
}
