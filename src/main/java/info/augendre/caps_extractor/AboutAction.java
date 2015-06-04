package info.augendre.caps_extractor;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Gabriel.
 */
public class AboutAction extends AbstractAction {
    public AboutAction() {
        super(I18nSupport.translate("plain.about_title"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog about = new AboutDialog();
        about.pack();
        about.setLocationRelativeTo(null);
        about.setVisible(true);
    }
}
