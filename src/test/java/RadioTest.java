import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldNotSetRadioStationNumberAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(10);

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(-1);

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetNextRadioStationNumber() {

        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(5);
        rad.setNextRadioStationNumber();


        int expected = 6;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldNotSetNextRadioStationNumberAboveMax() {

        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(9);
        rad.setNextRadioStationNumber();


        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetPrevRadioStationNumber() {

        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(5);

        rad.setPrevRadioStationNumber();


        int expected = 4;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetPrevRadioStationNumberBelowMin() {

        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(0);
        rad.setPrevRadioStationNumber();


        int expected = 9;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetCurrentVolume() {

        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetCurrentVolumeBelowMin() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetIncreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setIncreaseVolume();


        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldNotSetIncreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetDecreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setDecreaseVolume();


        int expected = 49;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetDecreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setDecreaseVolume();


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNumberQuantity30() {
        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(15);

        int expected = 15;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldNotSetRadioStationNumberAboveMaxQuantity30() {
        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(30);

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMinQuantity30() {
        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(-1);

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetNextRadioStationNumberQuantity30() {

        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(15);
        rad.setNextRadioStationNumber();


        int expected = 16;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldNotSetNextRadioStationNumberAboveMaxQuantity30() {

        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(29);
        rad.setNextRadioStationNumber();


        int expected = 0;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetPrevRadioStationNumberQuantity30() {

        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(15);

        rad.setPrevRadioStationNumber();


        int expected = 14;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldNotSetPrevRadioStationNumberBelowMinQuantity30() {

        Radio rad = new Radio(30);

        rad.setCurrentRadioStationNumber(0);
        rad.setPrevRadioStationNumber();


        int expected = 29;
        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);


    }


}
