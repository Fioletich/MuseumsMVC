package views;

import models.MuseumModel;

import javax.swing.*;

public class ResultPopUp extends JFrame {
    private JLabel nameLabel;
    private JLabel openingTimeLabel;
    private JLabel closingTimeLabel;
    private JLabel ticketPriceLabel;
    private JLabel addressLabel;
    private JPanel mainPanel;

    public ResultPopUp(MuseumModel museumModel) {
        setVisible(true);
        setContentPane(mainPanel);
        setSize(194, 189);

        nameLabel.setText(museumModel.getName());
        openingTimeLabel.setText(museumModel.getOpeningTime());
        closingTimeLabel.setText(museumModel.getClosingTime());
        ticketPriceLabel.setText(Double.toString(museumModel.getTicketPrice()));
        addressLabel.setText(museumModel.getAddress());
    }
}
