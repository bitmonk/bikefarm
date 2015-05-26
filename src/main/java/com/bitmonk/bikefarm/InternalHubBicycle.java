class InternalHubBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 3;
    int GEAR_MAX = 8;

    // every bicycle has a point at which pedaling it is pointless
    // this is a poor representation of that, but an improvement
    // gravity can still accelerate to dizzying speeds
    // and applying brakes is necessary to maintain speed
    int SPEED_MAX = 100;
    int CADENCE_MAX = 100;

    // don't like that this is an absolute set
    // not how acceleration works
    public boolean changeCadence(int newValue) {
         if (newValue >= 0) {
             cadence = newValue;
             return true;
         } else {
             cadence = 0;
             return true;
         }
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

    public boolean speedUp(int increment) {
         int new_speed = speed+increment;
         if (new_speed <= SPEED_MAX) {
             speed = new_speed;
             return true;
         } else {
             return false;
         }
    }

    public boolean applyBrakes(int decrement) {
         int new_speed = speed - decrement;
         if ( new_speed >= 0) {
             speed = new_speed;
             return true;
         } else {
             speed = 0;
             return true;
         }
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}

