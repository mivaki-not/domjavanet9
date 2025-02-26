package ru.netology.javaqa.domjavanet9.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio(10);
        radio.getMaxStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCustomConstructor() {
        Radio radio = new Radio(15);

        int expected = 15;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentRadioStationNumberValid() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentRadioStationNumberNegative() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentRadioStationNumberInvalidAboveMax() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(11);

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxRadioStationNumbere() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextRadioStationNumberTest() {  //
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTestNull() {  //
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

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

        int expected = 10;
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

    @Test
    public void testSetCurrentRadioStationNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}