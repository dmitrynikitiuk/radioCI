public class Radio {
    public int currentVolume;

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;

    }

    public int currentStation;

    public void setToLastStation() {
        currentStation = 9;
    }

    public void setToFirstStation() {
        currentStation = 0;
    }

    public int goToNextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int goToPreviousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
        return currentStation;
    }
}

