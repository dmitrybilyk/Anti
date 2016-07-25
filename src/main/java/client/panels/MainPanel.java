package client.panels;

import client.events.UserIsLoggedInEvent;
import client.events.UserIsLoggedInHandler;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.TabLayoutPanel;

/**
 * Created by Dimon on 19.07.2016.
 */
public class MainPanel extends TabLayoutPanel implements UserIsLoggedInHandler {
  /**
   * Creates an empty tab panel.
   *
   * @param barHeight the size of the tab bar
   * @param barUnit   the unit in which the tab bar size is specified
   */
  public MainPanel(double barHeight, Style.Unit barUnit) {
    super(barHeight, barUnit);

  }

  @Override
  public void onMessageReceived(UserIsLoggedInEvent event) {
    String s = "dfdf";
  }
}
