class ParkingSystem {
    private int bigSlots;
    private int mediumSlots;
    private int smallSlots;

    // Constructor
    public ParkingSystem(int big, int medium, int small) {
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;
    }

    // Add a car of given type: 1 = big, 2 = medium, 3 = small
    public boolean addCar(int carType) {
        if (carType == 1 && bigSlots > 0) {
            bigSlots--;
            return true;
        } else if (carType == 2 && mediumSlots > 0) {
            mediumSlots--;
            return true;
        } else if (carType == 3 && smallSlots > 0) {
            smallSlots--;
            return true;
        } else {
            return false; // No space available
        }
    }
}
