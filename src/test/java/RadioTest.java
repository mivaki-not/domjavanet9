import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentRadioStationNumber() {
        Radio next = new Radio();

        next.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = next.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeTest() {
        Radio next = new Radio();

        next.increaseVolume(100);

        int expected = 1;
        int actual = next.increaseVolume(0);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void decreaseVolumeTest() {
        Radio next = new Radio();

        next.decreaseVolume(100);

        int expected = 31;
        int actual = next.decreaseVolume(30);

        Assertions.assertEquals(expected, actual);

     }
}