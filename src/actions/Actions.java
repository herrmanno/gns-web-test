package actions;

import store.DIALOG_STORE;

public class Actions extends AbstractActions {

	public static final String USERS_REFRESH = "USERS_REFRESH";
	public static final String USER_SELECTED = "USER_SELECTED";
	public static final String NEW_USER = "NEW_USER";
	public static final String USER_SAVE = "USER_SAVE";
	public static final String USER_DELETE = "USER_DELETE";
	public static final String DIALOG_USER_DELETE = "DIALOG_USER_DELETE";
	
	public Actions() {
		add(DIALOG_STORE.ACTIONS);
		
		add(USERS_REFRESH);
		add(USER_SELECTED);
		add(NEW_USER);
		add(USER_SAVE);
		add(USER_DELETE);
		add(DIALOG_USER_DELETE);
	}
}
