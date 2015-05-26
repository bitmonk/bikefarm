class InternalHubBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 3;
    int GEAR_MAX = 8;

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public boolean shiftUp() {
      if (gear < GEAR_MAX) {
        gear++;
        return true;
      } else {
        return false;
      }
    }

    public boolean shiftDown() {
      if (gear > 1) {
        gear--;
        return true;
      } else {
        return false;
      }
    }

    public boolean changeGear(int newValue) {
      if ( newValue <= GEAR_MAX ) {
        gear = newValue;
        return true;
      } else {
        return false;
      }
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}

