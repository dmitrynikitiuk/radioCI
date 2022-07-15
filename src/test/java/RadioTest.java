import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 5;

        int expected = 5;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 8;
        int expected = 9;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfMax() {
        Radio radio = new Radio();

        radio.currentVolume = 10;
        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfMore() {
        Radio radio = new Radio();

        radio.currentVolume = 11;
        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;
        int expected = 4;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfLess() {
        Radio radio = new Radio();

        radio.currentVolume = -1;
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.currentStation = 4;

        int expected = 4;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStation() {
        Radio radio = new Radio();

        radio.setToLastStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStation() {
        Radio radio = new Radio();

        radio.setToFirstStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio();

        radio.currentStation = 6;
        int expected = 7;
        int actual = radio.goToNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGoToNextStationIfLast() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        int expected = 0;
        int actual = radio.goToNextStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGoToPreviousStation() {
        Radio radio = new Radio();

        radio.currentStation = 5;
        int expected = 4;
        int actual = radio.goToPreviousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGoToPreviousStationIfFirst() {
        Radio radio = new Radio();

        radio.currentStation = 0;
        int expected = 9;
        int actual = radio.goToPreviousStation();
        Assertions.assertEquals(expected, actual);
    }

}