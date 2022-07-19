import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class RadioTest {
    @Test
    public void ShouldSetStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(5);

        assertEquals(5, radio.getСurrentStation());
    }
    @Test
    public void ShouldChoseStation() {
        Radio radio = new Radio(20);
        radio.setСurrentStation(8);

        assertEquals(8, radio.getСurrentStation());
    }
    @Test
    public void ShouldNotSetImpossibleStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(-1);

        assertEquals(0, radio.getСurrentStation());
    }

    @Test
    public void ShouldNotSetStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(10);

        assertEquals(0, radio.getСurrentStation());
    }

    @Test
    public void shouldSetLastStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(9);

        assertEquals(9, radio.getСurrentStation());
    }

    @Test
    public void shouldSetFirstStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(0);

        assertEquals(0, radio.getСurrentStation());
    }

    @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(2);
        radio.nextStation();
        int expected = 3;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(3, radio.getСurrentStation());
    }

    @Test
    public void shouldGoToNextStationIfMax() {
        Radio radio = new Radio();
        radio.setСurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(0, radio.getСurrentStation());
    }

    @Test
    public void shouldGoToPreviousStation() {
        Radio radio = new Radio();
        radio.setСurrentStation(7);
        radio.previousStation();
        int expected = 6;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(6, radio.getСurrentStation());
    }

    @Test
    public void shouldGoToPreviousStationIfMin() {
        Radio radio = new Radio();
        radio.setСurrentStation(0);
        radio.previousStation();
        int expected = 9;
        int actual = radio.getСurrentStation();
        Assertions.assertEquals(9, radio.getСurrentStation());

    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetImpossibleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(21, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.decreaseVolume();
        int expected = 39;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}