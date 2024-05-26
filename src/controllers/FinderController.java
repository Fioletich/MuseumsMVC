package controllers;

import models.MuseumModel;
import views.MuseumFinderByPrice;
import views.ResultPopUp;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class FinderController {
    private ArrayList<MuseumModel> museumsModels;
    private MuseumFinderByPrice museumFinderByPriceView;
    private ResultPopUp resultPopUp;
    private int museumsFindersCounter = 0;
    private int resultsPopUpCounter = 0;

    public FinderController() {
        this.museumsModels = new ArrayList<>();
    }

    private void findAction(ActionEvent actionEvent) {
        if (resultsPopUpCounter != 0) {
            resultPopUp.dispose();
            resultPopUp = new ResultPopUp(findMuseum(Double.parseDouble(museumFinderByPriceView.getPriceTextField())));
            resultPopUp.setLocationRelativeTo(museumFinderByPriceView);
            museumFinderByPriceView.setPriceTextField("");
            return;
        }
        resultsPopUpCounter++;
        resultPopUp = new ResultPopUp(findMuseum(Double.parseDouble(museumFinderByPriceView.getPriceTextField())));
        resultPopUp.setLocationRelativeTo(museumFinderByPriceView);
        museumFinderByPriceView.setPriceTextField("");
    }

    private MuseumModel findMuseum(double price) {
       for (MuseumModel museumModel : museumsModels) {
            if (museumModel.getTicketPrice() == price) {
                return museumModel;
            }
        }
       return new MuseumModel();
    }

    public void createWindow() {
        if (museumsFindersCounter != 0) {
            museumFinderByPriceView.dispose();

            museumFinderByPriceView = new MuseumFinderByPrice();
            museumFinderByPriceView.addFindButtonActionListener(this::findAction);
            return;
        }

        museumsFindersCounter++;

        museumFinderByPriceView = new MuseumFinderByPrice();
        museumFinderByPriceView.addFindButtonActionListener(this::findAction);
    }

    public void setMuseumsModels(ArrayList<MuseumModel> museumsModels) {
        this.museumsModels = museumsModels;
    }
}
