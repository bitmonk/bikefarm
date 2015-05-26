interface Bicycle {

    boolean changeCadence(int newValue);

    boolean shiftUp();

    boolean shiftDown();

    boolean changeGear(int newValue);

    boolean speedUp(int increment);

    boolean applyBrakes(int decrement);

    void printStates();
}

