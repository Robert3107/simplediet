package com.simplediet.app.spoonacular.model.entity.recipes;

import java.util.List;

public class WinePairing {
    private List<String> pairedWines;
    private String pairingText;
    private List<ProductMatch> productMatches;

    public WinePairing(List<String> pairedWines, String pairingText, List<ProductMatch> productMatches) {
        this.pairedWines = pairedWines;
        this.pairingText = pairingText;
        this.productMatches = productMatches;
    }

    public WinePairing() {
    }

    public List<String> getPairedWines() {
        return pairedWines;
    }

    public void setPairedWines(List<String> pairedWines) {
        this.pairedWines = pairedWines;
    }

    public String getPairingText() {
        return pairingText;
    }

    public void setPairingText(String pairingText) {
        this.pairingText = pairingText;
    }

    public List<ProductMatch> getProductMatches() {
        return productMatches;
    }

    public void setProductMatches(List<ProductMatch> productMatches) {
        this.productMatches = productMatches;
    }
}
