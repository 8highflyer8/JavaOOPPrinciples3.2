package ru.netology;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    private int radioStationQuantity;
    private int maxRadioStationNumber;

    public Radio() {
        this.radioStationQuantity = 10;
        maxRadioStationNumber = radioStationQuantity - 1;
    }

    public Radio(int radioStationQuantity) {
        maxRadioStationNumber = radioStationQuantity - 1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getRadioStationQuantity() {
        return radioStationQuantity;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setNextRadioStationNumber() {
        if (currentRadioStationNumber > maxRadioStationNumber - 1) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }

    }

    public void setPrevRadioStationNumber() {
        if (currentRadioStationNumber < 1) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

