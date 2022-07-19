
public class Radio {
    private int сurrentStation;
    private int currentVolume;
    private int stationsNumber;

    public Radio() {

    }

    public Radio(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }


    public int getСurrentStation() {
        return сurrentStation;
    }

    public void nextStation() {
        if (сurrentStation < 9) {
            сurrentStation = сurrentStation + 1;
            return;
        }
        сurrentStation = 0;
    }


    public void previousStation() {
        if (сurrentStation > 0) {
            сurrentStation = сurrentStation - 1;
        } else {
            сurrentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void setСurrentStation(int сurrentStation) {
        if (сurrentStation < 0) {
            return;
        }
        if (сurrentStation > 9) {
            return;
        }

        this.сurrentStation = сurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

