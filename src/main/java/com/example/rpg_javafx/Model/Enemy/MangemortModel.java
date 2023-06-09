package com.example.rpg_javafx.Model.Enemy;

import Model.AttackModel;
import Model.EnemyModel;
import Model.WizardModel;

import java.util.List;

public class MangemortModel extends EnemyModel {
    private int visibility;

    public MangemortModel(String name, int health, List<AttackModel> mangemortAttacks, WizardModel wizard) {
        super("Mangemort", health, AttackModel.getDeathEaterAttacks(),wizard);
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
}
