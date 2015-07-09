package store;

import actions.Actions;
import model.User;

public class USER_STORE extends Store {

	private static String[] initFunctions = new String[] {
		"var m = window.location.hash.match(/.*(\\d+)/); if(m) self.load(m[1]);"
	};

	public USER_STORE() {
		super(new StoreInitObject("USER_STORE", "model/User", false, new User(), initFunctions ));
		
		
		//on("STATE_USER_SELECT", "self.set(STORES.USERS_STORE.get(data));");
		
		on("STATE_USER_SELECT", "self.load();");
		
		on("STATE_USER_NEW", "self.set({});");
		
		//on(Actions.NEW_USER, "self.set({});");
		
		on(Actions.USER_SAVE, "self.post();");
	}
}
