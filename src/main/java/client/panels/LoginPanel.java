package client.panels;

import client.events.UserIsLoggedInEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.*;

/**
 * Created by Dimon on 19.07.2016.
 */
public class LoginPanel extends VerticalPanel{

    private HandlerManager handlerManager;
    public LoginPanel() {
//        setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
//        setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        getElement().setAttribute("align", "center");
        getElement().setAttribute("vertical-align", "middle");
        handlerManager = new HandlerManager(this);
        add(getLoginPanel());
    }

    private Widget getLoginPanel() {
        // Create a table to layout the form options
        FlexTable layout = new FlexTable();
        layout.setCellSpacing(6);
        FlexTable.FlexCellFormatter cellFormatter = layout.getFlexCellFormatter();

        // Add a title to the form
        layout.setHTML(0, 0, "Вход в систему");
        cellFormatter.setColSpan(0, 0, 2);
        cellFormatter.setHorizontalAlignment(
                0, 0, HasHorizontalAlignment.ALIGN_CENTER);

        // Add some standard form options
        layout.setHTML(1, 0, "Имя");
        TextBox nameTextBox = new TextBox();
        nameTextBox.addKeyUpHandler(new KeyUpHandler() {
            @Override
            public void onKeyUp(KeyUpEvent event) {
                if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                    handlerManager.fireEvent(new UserIsLoggedInEvent("admin"));
                }
            }
        });
        layout.setWidget(1, 1, nameTextBox);
        layout.setHTML(2, 0, "Пароль");
        layout.setWidget(2, 1, new TextBox());

        // Wrap the content in a DecoratorPanel
        DecoratorPanel decPanel = new DecoratorPanel();
        decPanel.setWidget(layout);
        return decPanel;
    }

    public Widget asWidget() {
        return super.asWidget();
    }
}
