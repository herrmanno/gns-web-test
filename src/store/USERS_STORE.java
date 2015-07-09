package store;

import actions.Actions;

public class USERS_STORE extends Store {

	private static final StoreInitObject INIT = new StoreInitObject(
		//NAME
		"USERS_STORE",
		//URL
		"model/User",
		//LOAD-ON-CREATE
		true,
		//DEFAULT OBJECT
		new Object[]{},
		//INIT-FUNCTIONS
		new String[]{}
	);

	public USERS_STORE() {
		super(INIT);
		
		on(Actions.USERS_REFRESH, "self.load();");
		
		on(Actions.DIALOG_USER_DELETE, "self.deleteID = data; ROUTER.go('user/'+data+'/delete'); ACTIONS.DIALOG_OPEN();");
		
		on(Actions.USER_DELETE, "self.delete(data);");
		
	}
}
