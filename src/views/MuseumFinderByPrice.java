package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MuseumFinderByPrice extends JFrame {
    private JTextField priceTextField;
    private JButton findButton;
    private JPanel mainPanel;

    public MuseumFinderByPrice() {
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
        setSize(334, 142);
    }

    public String getPriceTextField() {
        return priceTextField.getText();
    }
    public void setPriceTextField(String price) {
        priceTextField.setText(price);
    }
    public void addFindButtonActionListener(ActionListener actionListener) {
        findButton.addActionListener(actionListener);
    }
}
