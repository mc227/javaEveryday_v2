package org.example;


import java.io.*;

public class SavedGame implements Serializable {
    private static final long serialVersionUID = 1L;
    public transient TerritoryInfo territoryInfo;
    public ResourceInfo resourceInfo;
    public DiplomacyInfo diplomacyInfo;

    public SavedGame(TerritoryInfo territoryInfo, ResourceInfo resourceInfo, DiplomacyInfo diplomacyInfo) {
        this.territoryInfo = territoryInfo;
        this.resourceInfo = resourceInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public TerritoryInfo getTerritoryInfo() {
        return territoryInfo;
    }

    public void setTerritoryInfo(TerritoryInfo territoryInfo) {
        this.territoryInfo = territoryInfo;
    }

    public ResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public DiplomacyInfo getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(DiplomacyInfo diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "territoryInfo=" + territoryInfo +
                ", resourceInfo=" + resourceInfo +
                ", diplomacyInfo=" + diplomacyInfo +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TerritoryInfo territoryInfo = new TerritoryInfo( "Russia has 10 provinces, France has 8 provinces");
        ResourceInfo resourceInfo = new ResourceInfo("Spain has 100 gold, Russia has 80 gold, France has 90 gold");
        DiplomacyInfo diplomacyInfo = new DiplomacyInfo("France is at war with Russia, Spain has taken a neutral position");

        SavedGame savedGame = new SavedGame(territoryInfo,resourceInfo,diplomacyInfo);

        FileOutputStream fileOutputStream = new FileOutputStream("saved.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(savedGame);
        fileOutputStream.close();
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("saved.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        SavedGame mark = (SavedGame) object;
        System.out.println(mark.toString());
    }
}