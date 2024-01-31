package org.example;


import java.io.*;
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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String[] territoryInfo = {"Spain has 6 provinces", "Russia has 10 provinces", "France has 8 provinces"};
//        String[] resourceInfo = {"Spain has 100 gold", "Russia has 80 gold", "France has 90 gold"};
//        String[] diplomacyInfo = {"France is at war with Russia, Spain has taken a neutral position"};
//
//        SavedGame savedGame = new SavedGame(territoryInfo,resourceInfo,diplomacyInfo);
//
//        FileOutputStream fileOutputStream = new FileOutputStream("saved.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(savedGame);
//        fileOutputStream.close();
//        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("saved.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        SavedGame savedGame = (SavedGame) object;
        System.out.println(savedGame.toString());
    }
}