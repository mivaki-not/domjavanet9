package ru.netology.javaqa.domjavanet9.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouleSetRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRadioStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void MaxRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest2() {  //
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest() {  //
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);

        int expected = 88;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(29);
        radio.increaseVolume();

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.decreaseVolume();

        int expected = 29;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeinMinTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeinMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}