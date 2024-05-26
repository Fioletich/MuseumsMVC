package controllers;

import models.MuseumModel;
import views.MuseumView;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MuseumController {
    private final ArrayList<MuseumModel> museumModels;
    private final MuseumView museumView;
    private final FinderController finderController;

    public MuseumController(MuseumView museumView) {
        museumModels = new ArrayList<>();
        this.museumView = museumView;
        finderController = new FinderController();

        museumView.setAddButtonListener(this::addMuseumAction);
        museumView.setFindByPriceButtonListener(this::FindMuseumAction);
    }

    private void addMuseumAction(ActionEvent actionEvent) {
        museumModels.add(new MuseumModel()
                        .setName(museumView.getNameTextField())
                        .setOpeningTime(museumView.getOpeningTimeTextField())
                        .setClosingTime(museumView.getClosingTimeTextField())
                        .setAddress(museumView.getAddressTextField())
                        .setTicketPrice(Double.parseDouble(museumView.getTicketPriceTextField())));

        museumView.setNameTextField("");
        museumView.setOpeningTimeTextField("");
        museumView.setClosingTimeTextField("");
        museumView.setAddressTextField("");
        museumView.setTicketPriceTextField("");

        finderController.setMuseumsModels(museumModels);
    }

    private void FindMuseumAction(ActionEvent actionEvent) {
        finderController.createWindow();
        finderController.setMuseumsModels(museumModels);
    }
}
