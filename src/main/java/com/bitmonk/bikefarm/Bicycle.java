interface Bicycle {

    void changeCadence(int newValue);

    boolean shiftUp();

    boolean shiftDown();

    boolean changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

    void printStates();
}

