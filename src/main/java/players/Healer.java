package players;

import weapons.HealingImplement;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private HealingImplement equippedHealingImplement;
    private ArrayList<HealingImplement> medicineCabinet;

    public Healer(String name, int health) {
        super(name, health);
        this.medicineCabinet = new ArrayList<HealingImplement>();
    }

    public HealingImplement getEquippedHealingImplement() {
        return equippedHealingImplement;
    }

    public ArrayList<HealingImplement> getMedicineCabinet() {
        return medicineCabinet;
    }

    public void setEquippedHealingImplement(HealingImplement healingImplement) {
        this.equippedHealingImplement = equippedHealingImplement;
    }

    public void setMedicineCabinet(ArrayList<HealingImplement> medicineCabinet) {
        this.medicineCabinet = medicineCabinet;
    }

    public void pickUpHealingImplement(HealingImplement healingImplement) {
        this.medicineCabinet.add(healingImplement);
    }
}
