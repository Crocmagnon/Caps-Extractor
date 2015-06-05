package info.augendre.caps_extractor.actions;

import info.augendre.caps_extractor.util.I18nSupport;
import info.augendre.caps_extractor.gui.AboutDialog;

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
