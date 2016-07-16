package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Created by Dimon on 16.07.2016.
 */
public class Anti implements EntryPoint {
    public void onModuleLoad() {
        RootPanel.get().add(new Label("some text"));
    }
}
