public class Radio {

    public int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber <0){
            newCurrentRadioStationNumber = 9;
            return;
        }
        if (newCurrentRadioStationNumber >9){
            newCurrentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber() {
        currentRadioStationNumber = 9;
    }


    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }
    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

}
