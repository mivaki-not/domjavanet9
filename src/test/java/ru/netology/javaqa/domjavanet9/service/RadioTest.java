package ru.netology.javaqa.domjavanet9.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouleRadioStationNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxRadioStationNumber() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxRadioStationNumbere() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextRadioStationNumberTest2y() {  //
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest3() {  //
        Radio radio = new Radio(20);
        radio.setCurrentRadioStationNumber(10);
        radio.next();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest2() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest3() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(10);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}