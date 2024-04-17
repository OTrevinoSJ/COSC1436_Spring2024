public class Tesla extends Car{
    
    private boolean isCharging;
    private String computerChip;
    private String batteryType;
    private int MAX_MILES = 300000;
    private int currentBatteryLife;

    /**
     * A constructor to create an instance of a tesla
     * @param model model of Tesla
     * @param brand brand of Tesla
     * @param color color of Tesla
     * @param cost cost of Tesla
     * @param batteryLife current battery life of tesla. Tesla object starts with no battery inside, you must assign one
     * 
     */
    public Tesla(String model, String brand, String color, int cost, int batteryLife) {
        super(model, brand, color, cost);
        this.currentBatteryLife = batteryLife;
        this.isCharging = false;
        System.out.println("Don't forget to add a battery type :_)");

    }

    /**
     * A method to retrieve the current battery status
     * @return the current battery life
     */
    public int getBatteryPercentage(){
        return this.currentBatteryLife;
    }

    /**
     * A method that retrieves the value of max miles available for the car
     * @return the amount of max miles
     */
    public int getMaxMiles(){
        return this.MAX_MILES;
    }

    /**
     * A method that sets the chip for the vehicle
     * @param chip sets the chip of the tesla vehicle
     */
    public void setChip(String chip){
        this.computerChip = chip;
    }

    /**
     * A method to retrieve the chip name
     * @return the name of the chip in use
     */
    public String getChip(){
        return this.computerChip;
    }

    /**
     * A method that allows you to set the chip to use for the object
     * @param batteryType sets the physical battery that the tesla vehicle uses
     */
    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    /**
     * A method that retrieves the battery type
     * @return the name of the current battery in use
     */
    public String getBatteryType() {
        if (this.batteryType == null) {
            System.out.println("This tesla vehicle has no battery please add one using the set method");
        }
        return this.batteryType;
    }

    /**
     * A method that can charge the vehicle
     */
    public void charge() {
        if (this.batteryType == null) {
            System.out.println("You need a battery to charge first");
            return;
        }
        this.isCharging = true;
        System.out.println("Charging the " + getBatteryType() + " now");
        while (this.currentBatteryLife < 100) {
            try {
                announceStatus();
                loadingBar();
                this.currentBatteryLife+=1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.isCharging = false;
    }

    
    /*
     * A method to display a charging status with loading lines
     * @throws InterruptedException Thread.sleep requires an InterruptedException to be thrown
     */
    private void loadingBar() throws InterruptedException {
        System.out.println("Charging.");
        Thread.sleep(1000);
        System.out.println("Charging..");
        Thread.sleep(1000);
        System.out.println("Charging...");
        Thread.sleep(1000);
        System.out.println("Charging..");
        Thread.sleep(1000);
        System.out.println("Charging.");
        Thread.sleep(1000);
            
    }

    /*
     * This method announces a status for every ten level increase
     */
    private void announceStatus(){
        if (this.currentBatteryLife % 10 == 0) {
            System.out.println("Charge is at " + this.currentBatteryLife + " percent");
        }
    }


}
