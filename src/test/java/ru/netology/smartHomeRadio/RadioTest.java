package ru.netology.smartHomeRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetStation() { //установка станции
        Radio radio = new Radio();
        radio.currentStation = 5;
        int expected = 5;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() { //устанвка максимальной станции
        Radio radio = new Radio();
        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() { //установка минимальной станции
        Radio radio = new Radio();
        radio.setToMinStation();
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() { //следующая станция
        Radio radio = new Radio();
        radio.currentStation = 7;
        radio.next();

        int expected = 8;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationAboveMax() { //переключение через кнопку next, выше max
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.next();

        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButtonStation0Then9() { //переключение через кнопку prev со станции 0
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prev();

        int expected = 9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButtonStationNot0() { //переключение через кнопку prev
        Radio radio = new Radio();
        radio.currentStation = 2;
        radio.prev();

        int expected = 1;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume0() { //установка громкости 0
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume1() { //установка громкости 1
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume99() { //установка громкости 99
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reducingVolumeFrom0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.less();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeFrom99() { //увеличение громкости
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.more();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeFrom100() { //увеличение грмкости при  max
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.more();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reducingVolumeFrom1() { //установка громкости до минимума
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.less();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume101() { //установка при нуле
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeFrom0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.more();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeFrom1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.more();
        int expected = 2;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reducingVolumeFrom99() { //уменьшение громкости при нуле
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.less();
        int expected = 98;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reducingVolumeFrom100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.less();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinus1() { //установка громкости 1
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinus100() { //установка громкости 1
        Radio volume = new Radio();
        volume.setCurrentVolume(-100);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
