package client.events;

import com.google.gwt.event.shared.EventHandler;

public interface UserIsLoggedInHandler extends EventHandler {
    void onMessageReceived(UserIsLoggedInEvent event);
}