package whatever;

import java.util.function.Function;

public class fn {
	public static <A, B, C> Function<A, C> compose(Function<B, C> g, Function<A, B> f) {
		return (A x) -> {
			return g.apply(f.apply(x));
		};
	}
	public static String exclaim(String s) {
		return s + "!";
	}
	public static String shout(String s) {
		return s.toUpperCase();
	}
	public static String log(String msg) {
		System.out.println(msg);
		return msg;
	}
}
