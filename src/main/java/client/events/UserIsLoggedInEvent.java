package client.events;

import com.google.gwt.event.shared.GwtEvent;

public class UserIsLoggedInEvent extends GwtEvent<UserIsLoggedInHandler> {

    public static Type<UserIsLoggedInHandler> TYPE = new Type<UserIsLoggedInHandler>();

    private String login;

    public UserIsLoggedInEvent(String login) {
        this.login = login;
    }

    public Type<UserIsLoggedInHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(UserIsLoggedInHandler handler) {
        handler.onMessageReceived(this);
    }

    public String getLogin() {
        return login;
    }
}