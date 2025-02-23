package ru.netology.javaqa.domjavanet9.service;

public class Radio {

    private int currentRadioStationNumber;
    private int currentVolume;

    public void setMaxNumberStation() {
        currentRadioStationNumber = 9;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 9) {
            currentRadioStationNumber = newCurrentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 0) {
            currentRadioStationNumber = newCurrentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}