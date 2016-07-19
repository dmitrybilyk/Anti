package client.panels;

import com.google.gwt.user.client.ui.*;

/**
 * Created by Dimon on 19.07.2016.
 */
public class LoginPanel extends VerticalPanel{

    public LoginPanel() {
//        setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
//        setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        getElement().setAttribute("align", "center");
        getElement().setAttribute("vertical-align", "middle");
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
        layout.setWidget(1, 1, new TextBox());
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