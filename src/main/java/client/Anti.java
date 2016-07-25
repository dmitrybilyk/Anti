package client;

import client.panels.LoginPanel;
import client.panels.MainPanel;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.*;

/**
 * Created by Dimon on 16.07.2016.
 */
public class Anti implements EntryPoint {
    public void onModuleLoad() {
        MainPanel mainPanel = new MainPanel(2.5, Style.Unit.EM);
        RootPanel.get().add(new LoginPanel());
    }
}
