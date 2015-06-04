package info.augendre.caps_extractor;

import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created by Gabriel.
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        super(I18nSupport.translate("plain.title"));
        this.setup();
    }

    public JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu help = new JMenu(I18nSupport.translate("menu.help"));
        menuBar.add(help);
        JMenuItem helpItem = new JMenuItem(new HelpAction());
        help.add(helpItem);
        JMenuItem about = new JMenuItem(new AboutAction());
        help.add(about);
        return menuBar;
    }

    public void setup() {
        MainPanel mainPanel = new MainPanel();
        JPanel contentPanel = mainPanel.getContentPanel();
        this.setJMenuBar(createMenu());
        this.setContentPane(contentPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace(System.err);
        }
        new MainWindow();
    }
}
