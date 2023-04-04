package ru.netology;

public class Radio {
    int up;
    int down;
    public int currentRadioStationNumber;
    public int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setNextRadioStationNumber() {
        if (currentRadioStationNumber > 8) {
            up = 0;
        } else {
            up = currentRadioStationNumber + 1;
        }

        setCurrentRadioStationNumber(up);

    }

    public void setPrevRadioStationNumber() {
        if (currentRadioStationNumber < 1) {
            down = 9;
        } else {
            down = currentRadioStationNumber - 1;
        }

        setCurrentRadioStationNumber(down);

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

