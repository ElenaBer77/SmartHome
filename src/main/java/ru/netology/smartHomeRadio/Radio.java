package ru.netology.smartHomeRadio;


public class Radio {
    //public int setCurrentVolume;
    // public int CurrentVolume;
    //private int currentStation;
    private int currentVolume;
    public int currentStation;

    //return currentStation;
    // return ;
    //}
    //public int currentVolume;
    //public int getCurrentVolume() {
    //  return currentVolume;
    //}

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    //public void setToMaxVolume() {
    //   currentVolume = 100;
    //}

    //public void setToMinVolume() {
    //  currentStation = 0;
    //}

    public int less() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return 0;
    }

    public void more() {
        if (currentVolume < 100) {
            currentVolume++;
            //} else {
            //   currentVolume = currentVolume + 1;
            //}
        }

    }
}
