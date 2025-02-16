import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void CurrentRadioStationNumber() {
        Radio next = new Radio();

        next.setCurrentRadioStationNumber(3);

        int expected = 4;
        int actual = next.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationNumber2() {
        Radio prev = new Radio();

        prev.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = prev.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestToturnOnTheSelectedStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void increaseVolumeTest() {
        Radio next = new Radio();

        next.increaseVolume(100);

        int expected = 29;
        int actual = next.increaseVolume(30);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void decreaseVolumeTest() {
        Radio next = new Radio();

        next.decreaseVolume(100);

        int expected = 4;
        int actual = next.decreaseVolume(3);

        Assertions.assertEquals(expected, actual);

     }

    @Test
    public void decreaseVolumeinNullTest() {
        Radio next = new Radio();

        next.decreaseVolume(100);

        int expected = 0;
        int actual = next.decreaseVolume(0);

        Assertions.assertEquals(expected, actual);

    }
}