package whatever;

import java.util.function.Function;

public class main {

	public static void main(String[] args) {
		
		Function<String, String> shoutExclaim = fn.compose(fn::exclaim, fn::shout);
		Function<String, String> excitedLog = fn.compose(fn::log, shoutExclaim);

		Just<String> a = new Just<String>("hello fabien...");
		
		a.map(excitedLog);
		a.map(fn::shout).map(fn::log).map(fn::exclaim).map(fn::log);
	}

}
