package whatever;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		Function<String, String> shoutExclaim = fn.compose(fn::exclaim, fn::shout);
		Function<String, String> excitedLog = fn.compose(fn::log, shoutExclaim);

		Maybe<String> a = new Maybe<String>("hello world");
        Maybe<String> b = new Maybe<String>(null);
		
		// a.map(excitedLog);
		a.map(fn::shout).map(fn::log);//.map(fn::exclaim).map(fn::log);

		b.map(excitedLog);
		b.map(fn::shout)
			.map(fn::log)
			.map(fn::exclaim)
			.map(fn::log);
		
		new Main().thing();
	}

	public String thing(String... myInput) {
		System.out.println(myInput.length);
		return "";
	}
	
	public void thing() {
		thing("sgdgds", "gdsg", "sdgds", "sg");
	}
}