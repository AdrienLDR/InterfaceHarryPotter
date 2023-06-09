package com.example.rpg_javafx.Niveau;

import Controller.*;
import Model.*;
import View.*;

import java.util.List;

public class Level0 {
    public static void level0 (WizardModel wizard) {

        // create wizard
        WizardModel wizardModel = new WizardModel(null, 500, 1, null, null, 200, 1,null,null,null);
        WizardView wizardView = new WizardView();
        PetModel petModel = new PetModel();
        List<SpellModel> knownSpells = SpellModel.getAvailableSpells();
        SpellController spellController = new SpellController(wizardModel, knownSpells, new SpellView());

        HouseModel houseModel = new HouseModel();
        HouseView houseView = new HouseView(wizardModel);
        HouseController houseController = new HouseController(houseModel, houseView);

        WizardController wizardController = new WizardController(wizardModel, wizardView, houseModel, petModel, spellController,houseController);

        // choose wizard name

        // choose wizard house
        WizardModel.House chosenHouse = houseController.chooseHouse();
        houseModel.setHouseName(chosenHouse.toString());


        // create wand
        WandModel wandModel = new WandModel();
        WandView wandView = new WandView();
        WandController wandController = new WandController(wandModel, wandView);
        wandController.createWand(wizard.getName());
        wizardModel.setWand(WandModel.getWood() + " " + WandModel.getLength());

        // choose pet
        PetView petView = new PetView();
        PetController petController = new PetController(petModel, petView);
        PetController.choosePet(wizardModel);

        // display wizard info

        wizardController.updateView();

        RewardController.giveRewardToWizard(wizard);


    }
}
