package info.augendre.caps_extractor;

import info.augendre.caps_extractor.gui.MainWindow;

import javax.swing.*;

/**
 * Created on 05/06/15.
 *
 * @author gaugendre
 */
public class CapsExtractorApp {
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
