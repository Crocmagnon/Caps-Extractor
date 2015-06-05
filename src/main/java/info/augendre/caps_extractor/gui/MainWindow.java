package info.augendre.caps_extractor.gui;

import info.augendre.caps_extractor.actions.AboutAction;
import info.augendre.caps_extractor.actions.HelpAction;
import info.augendre.caps_extractor.util.I18nSupport;

import javax.swing.*;

/**
 * Created by Gabriel.
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        super(I18nSupport.translate("plain.title"));
        this.setup();
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu help = new JMenu(I18nSupport.translate("menu.help"));
        menuBar.add(help);
        JMenuItem helpItem = new JMenuItem(new HelpAction());
        help.add(helpItem);
        JMenuItem about = new JMenuItem(new AboutAction());
        help.add(about);
        return menuBar;
    }

    private void setup() {
        MainPanel mainPanel = new MainPanel();
        JPanel contentPanel = mainPanel.getContentPanel();
        this.setJMenuBar(createMenu());
        this.setContentPane(contentPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
