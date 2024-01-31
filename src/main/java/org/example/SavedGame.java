package org.example;


import java.io.Serializable;
import java.util.Arrays;

public class SavedGame implements Serializable {
    private static final long serialVersionUID = 1L;
    public String[] territoryInfo;
    public String[] resourceInfo;
    public String[] diplomacyInfo;

    public SavedGame(String[] territoryInfo, String[] resourceInfo, String[] diplomacyInfo) {
        this.territoryInfo = territoryInfo;
        this.resourceInfo = resourceInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public String[] getTerritoryInfo() {
        return territoryInfo;
    }

    public void setTerritoryInfo(String[] territoryInfo) {
        this.territoryInfo = territoryInfo;
    }

    public String[] getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(String[] resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public String[] getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "territoryInfo=" + Arrays.toString(territoryInfo) +
                ", resourceInfo=" + Arrays.toString(resourceInfo) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                '}';
    }
}