package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MuseumView extends JFrame {
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField openingTimeTextField;
    private JTextField closingTimeTextField;
    private JTextField ticketPriceTextField;
    private JTextField addressTextField;
    private JButton addButton;
    private JButton findByPriceButton;

    public MuseumView() {
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
        setSize(800, 600);
    }

    public void setAddButtonListener(ActionListener actionListener) {
        addButton.addActionListener(actionListener);
    }
    public void setFindByPriceButtonListener(ActionListener actionListener) {
        findByPriceButton.addActionListener(actionListener);
    }
    public String getNameTextField() {
        return nameTextField.getText();
    }
    public String getOpeningTimeTextField() {
        return openingTimeTextField.getText();
    }
    public String getClosingTimeTextField() {
        return closingTimeTextField.getText();
    }
    public String getTicketPriceTextField() {
        return ticketPriceTextField.getText();
    }
    public String getAddressTextField() {
        return addressTextField.getText();
    }
    public void setNameTextField(String name) {
        nameTextField.setText(name);
    }
    public void setOpeningTimeTextField(String openingTime) {
        openingTimeTextField.setText(openingTime);
    }
    public void setClosingTimeTextField(String closingTime) {
        closingTimeTextField.setText(closingTime);
    }
    public void setTicketPriceTextField(String ticketPrice) {
        ticketPriceTextField.setText(ticketPrice);
    }
    public void setAddressTextField(String address) {
        addressTextField.setText(address);
    }
}
