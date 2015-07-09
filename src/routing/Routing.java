package routing;

import store.DIALOG_STORE;
import store.USER_STORE;
import store.USERS_STORE;

public class Routing extends AbstractRouting {

	public Routing() {
		addGlobalStore(DIALOG_STORE.class.getSimpleName());
		
		add(VIEW._1, "user.*", HTML.USER, STORE.USERS);
		add(VIEW._2, "user/[0-9]+", HTML.USER_SELETED, STORE.USER);
		add(VIEW._2, "user/new", HTML.USER_NEW, STORE.USER);
		add(VIEW.DIALOG, "user/.*/delete", HTML.DIALOG_USER_DELETE);
		
		
		on(actions.Actions.USER_SELECTED, "self.go('user/'+data);");
		on(actions.Actions.DIALOG_USER_DELETE, "self.go('user/'+data+'/delete);");
	}

	private static class VIEW {
		private static String _1 = "view1";
		private static String _2 = "view2";
		private static String DIALOG = "dialog";
	}

	private static class HTML {
		private static String USER = "user";
		private static String USER_SELETED = "selected_user";
		private static String USER_NEW = "new_user";
		private static String DIALOG_USER_DELETE = "dialog_user_delete";
	}

	private static class STORE {
		private static String USERS = USERS_STORE.class.getSimpleName();
		private static String USER = USER_STORE.class.getSimpleName();
	}
}
