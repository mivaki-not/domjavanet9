package ru.netology.javaqa.domjavanet9.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouleRadioStationNumber() {
        Radio radio = new Radio();

        radio.setMaxNumberStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxRadioStationNumber() {
        Radio radio = new Radio();

        radio.setMaxNumberStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest() {
        Radio radio = new Radio();

        radio.nextStationNumber(3);

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest2() {  //
        Radio radio = new Radio();

        radio.nextStationNumber(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest3() {  //
        Radio radio = new Radio();

        radio.nextStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest() {
        Radio radio = new Radio();

        radio.prevStationNumber(4);
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest2() {
        Radio radio = new Radio();

        radio.prevStationNumber(0);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest3() {
        Radio radio = new Radio();

        radio.prevStationNumber(10);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio next = new Radio();

        next.increaseVolume(100);

        int expected = 30;
        int actual = next.increaseVolume(29);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest() {
        Radio next = new Radio();

        next.decreaseVolume(100);

        int expected = 29;
        int actual = next.decreaseVolume(30);

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