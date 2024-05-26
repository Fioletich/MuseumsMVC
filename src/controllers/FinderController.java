package controllers;

import models.MuseumModel;
import views.MuseumFinderByPrice;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class FinderController {
    private ArrayList<MuseumModel> museumsModels;
    private MuseumFinderByPrice museumFinderByPriceView;

    public FinderController() {
        this.museumsModels = new ArrayList<>();

        museumFinderByPriceView.addFindButtonActionListener(this::findAction);
    }

    private void findAction(ActionEvent actionEvent) {

    }
}
