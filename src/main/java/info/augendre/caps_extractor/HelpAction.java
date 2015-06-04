package info.augendre.caps_extractor;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Gabriel.
 */
public class HelpAction extends AbstractAction {
    public HelpAction() {
        super(I18nSupport.translate("plain.help_title"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog help = new HelpDialog();
        help.pack();
        help.setLocationRelativeTo(null);
        help.setVisible(true);
    }
}
