package views;

import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Dashboard extends JFrame {

    public Dashboard(){
        super("Gestion du Zoo");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(800, 600);
        setVisible(true);

        JPanel panneau = new JPanel();

        // Jlabel
        JLabel label = new JLabel("Hello World");
        panneau.add(label);

        // JtextField
        JTextField textField = new JTextField(20);
        panneau.add(textField);

        // JtextArea
        JTextArea textArea = new JTextArea(5, 20);
        panneau.add(textArea);

        // Jbutton
        JButton button = new JButton("Click me");
        panneau.add(button);

        // JcheckBox
        JCheckBox checkBox = new JCheckBox("Check me");
        panneau.add(checkBox);

        // JradioButton
        JRadioButton radioButton = new JRadioButton("Radio me");
        panneau.add(radioButton);

        // Jlist
        String[] liste = {"Item 1", "Item 2", "Item 3"};
        JList list = new JList(liste);
        panneau.add(list);

        // JcomboBox
        String[] comboList = {"Item 1", "Item 2", "Item 3"};
        JComboBox comboBox = new JComboBox(comboList);
        panneau.add(comboBox);

        // Jslider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        panneau.add(slider);

        // JprogressBar
        JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        panneau.add(progressBar);

        // Jspinner
        SpinnerModel model = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinner = new JSpinner(model);
        panneau.add(spinner);

        setContentPane(panneau);
        setVisible(true);

    }
}
