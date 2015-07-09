package state;

public class State extends StateBase {

	private static final STATE[] STATES = new STATE[] {
		new STATE() {{
			name = "USERS_SHOW";
			url = "users";
			views = new VIEW[] {
				new VIEW() {{
					name = "view1";
					url = "test";
				}},
				new VIEW() {{}}
				
			};
		}}
	};

	public State() {
		super(STATES);
	}
}
