public class Jake extends GameCharacter {

    // class instance fields
    private boolean isVisable;
    private final int DEFAULT_MAX = 5;
    private int[] usages = new int[2];
    private int[] maxUses = new int[2];

    /**
     * A constructor to create the instance of Jake
     * @param name name of Jake
     * @param age age of Jake
     * @param height height of Jake
     * @param weight weight of Jake
     */
    public Jake(String name, int age, int height, int weight) {
        super(name, age, height, weight);
        this.isVisable = true;
        setMaxPBlastUses(DEFAULT_MAX);
        setMaxCloakingUses(DEFAULT_MAX);
    }

    /**
     * A method to set the max usage of power blast
     * @param uses value to set the max usages of power blast
     */
    public void setMaxPBlastUses(int uses) {
        this.maxUses[0] = uses;
    }

    /**
     * A method to set the max usage of cloaking
     * @param uses value to the set the max usages of cloaking
     */
    public void setMaxCloakingUses(int uses) {
        this.maxUses[1] = uses;
    }

    /**
     * A method to use power blast ability
     */
    public void initiatePowerBlast() {
        if (this.usages[0] >= this.maxUses[0]) {
            System.out.println("You cannot use anymore power blasts");
        } else {
            System.out.println("Jake uses power blast");
            this.usages[0]++;
        }
    }

    /**
     * A method to use cloak ability
     */
    public void initiateCloak() {
        this.isVisable = false;
        if (this.usages[1] > this.maxUses[1]) {
            System.out.println("You cannot use anymore power blasts");
        } else {
            System.out.println("Jake uses power blast");
            this.usages[1]++;
        }

        System.out.println("Jake uses cloak and is now hidden");
    }

    /* 
    I do understand that I could create a method that takes in input to  decide which power to reset, but I dicided to create two separate ones for this case.
    */

    /**
     * A method to reset only the cloak ability
     */
    public void resetCloakUsage(){
        this.usages[1] = 0;
    }

    /**
     * A method to reset only the power blast ability
     */
    public void resetPowerBlastUsage(){
        this.usages[0] = 0;
    }

    /**
     * A method to reset all ability that jake contains
     */
    public void resetAllUsages(){
        for (int i = 0; i < this.usages.length; i++) {
            this.usages[i] = 0;
        }
    }
    


}