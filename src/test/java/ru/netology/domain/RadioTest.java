package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void settingStationCorrectly() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.next();

        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void settingVolumeCorrectly() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void settingStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void settingStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-9);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldResetStationWhenAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void shouldResetStationWhenBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();

        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();


        Assertions.assertEquals(9, radio.getCurrentVolume());
    }


    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void settingVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void settingVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}