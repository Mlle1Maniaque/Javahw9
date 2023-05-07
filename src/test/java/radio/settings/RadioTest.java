package radio.settings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAbove9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAfter9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBefore0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);

        int expected = 25;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeAbove100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(65);
        radio.increaseVolume();

        int expected = 66;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(39);
        radio.decreaseVolume();

        int expected = 38;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeIncreaseAbove100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeDecreaseBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
