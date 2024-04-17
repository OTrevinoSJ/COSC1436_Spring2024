public class Jake extends GameCharacter {

    private boolean isVisable;
    private final int DEFAULT_MAX = 5;
    private int[] usages = new int[2];
    private int[] maxUses = new int[2];

    public Jake(String name, int age, int height, int weight) {
        super(name, age, height, weight);
        this.isVisable = true;
        setMaxPBlastUses(DEFAULT_MAX);
        setMaxCloakingUses(DEFAULT_MAX);
    }

    public void setMaxPBlastUses(int uses) {
        this.maxUses[0] = uses;
    }

    public void setMaxCloakingUses(int uses) {
        this.maxUses[1] = uses;
    }

    public void initiatePowerBlast() {
        if (this.usages[0] >= this.maxUses[0]) {
            System.out.println("You cannot use anymore power blasts");
        } else {
            System.out.println("Jake uses power blast");
            this.usages[0]++;
        }
    }

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

    public void resetCloakUsage(){
        this.usages[1] = 0;
    }

    public void resetPowerBlastUsage(){
        this.usages[0] = 0;
    }

    public void resetAllUsages(){
        for (int i = 0; i < this.usages.length; i++) {
            this.usages[i] = 0;
        }
    }
    


}