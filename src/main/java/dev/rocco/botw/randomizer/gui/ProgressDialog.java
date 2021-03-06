package dev.rocco.botw.randomizer.gui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

public class ProgressDialog extends JDialog {
    private JPanel contentPane;
    public JProgressBar progressBar1;
    public JLabel patchingLabel;
    public static ProgressDialog inst;

    public ProgressDialog() {
        inst = this;
        $$$setupUI$$$();
        setContentPane(contentPane);
        setModal(true);
        createUIComponents();
    }


    public static void showDialog() {
        ProgressDialog dialog = new ProgressDialog();
        dialog.pack();
        dialog.setVisible(true);
    }

    public static void prog(String progress) {
        ProgressDialog.inst.patchingLabel.setText(progress);
    }

    private void createUIComponents() {
        patchingLabel = new JLabel();
        progressBar1 = new JProgressBar();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        patchingLabel.setText("Patching...");
        panel1.add(patchingLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        progressBar1.setStringPainted(true);
        panel1.add(progressBar1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }
}
