public class GameCharacter {

    // (Bonus) Two static variables to count characters with no clothes and to count the number of total accessories
    static int numOfNoClothesCharacters = 0;
    static int numOfTotalAccessories = 0;
    
    // instance class fields
    private String name;
    private int age;
    private int height;
    private int weight;
    private String shirt;
    private String pants;
    private String shoes;
    private String[] accessories;

    /**
     * A basic form of character creation. This form only require the essential data to create a simple character
     * @param name name of the character
     * @param age age of the character
     * @param height height of the character
     * @param weight weight of the character
     */
    public GameCharacter(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        numOfNoClothesCharacters += 1;
    }


    /**
     * A method that is a step up from the basic constructor. This constructor requires clothing attributes
     * @param name name of the character
     * @param age age of the character
     * @param height height of the character
     * @param weight weight of the character
     * @param shirt shirt for the character
     * @param pants pants for the character
     * @param shoes shoes for the character
     */
    public GameCharacter(String name, int age, int height, int weight, String shirt, String pants, String shoes) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    /**
     * This is an additional constructor to include any list of accessories
     * @param name name of the character
     * @param age age of the character
     * @param height height of the character
     * @param weight weight of the character
     * @param shirt shirt for the character
     * @param pants pants for the character
     * @param shoes shoes for the character
     * @param accessories accessories for the character
     */
    public GameCharacter(String name, int age, int height, int weight, String shirt, String pants, String shoes, String[] accessories) {
        this.name = name;
        this.weight = weight;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
        this.accessories = accessories;
        setHeight(height);
        setAge(age);
        numOfTotalAccessories += accessories.length;
    }

    /**
     * A method that retrieves the name of the character
     * @return the name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * A method that retrieves the age of the character
     * @return the age of the character
     */
    public int getAge() {
        return age;
    }

    /**
     * A method that retrieves the height of the character in centimeters
     * @return the height of the character in centimeters
     */
    public int getHeight() {
        return height;
    }

    /**
     * A method that retrieves the weight of the character
     * @return the weight of the character
     */
    public int getWeight() {
        return weight;
    }

    /**
     * A method to retrieve the shirt
     * @return the shirt of the character
     */
    public String getShirt() {
        return shirt;
    }

    /**
     * A method to retrieve the pants
     * @return the pants of the character
     */
    public String getPants() {
        return pants;
    }

    /**
     * A method to retrieve the shoes
     * @return the shoes of the character
     */
    public String getShoes() {
        return shoes;
    }

    /**
     * A method to retrieve the accessories
     * @return the accessories of the character
     */
    public String[] getAccessories() {
        return accessories;
    }

    /**
     * A method to set a name for the character
     * @param name name of the character
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A method to set the age of the character, plus added logic to keep age within a bound that is legitimate
     * @param age age of the character
     */
    public void setAge(int age) {
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    /**
     * A method to set the height of the character, plus added logic to keep the height within bounds that are legitimate
     * @param height height of the character in centimeters
     */
    public void setHeight(int height) {
        if (height <= 0) {
            this.height = 165;
        } else if (height < 54) {
            System.out.println("Congrats, you are the newest shortest person");
            this.height = height;
        } else {
            this.height = height;
        }
    }

    /**
     * A method to set the weight of the character, plus added logic to keep weight within bounds that are legitimate
     * @param weight weight of the character in pounds
     */
    public void setWeight(int weight) {
        if (weight <= 0) {
            this.weight = 150;
        } else if (weight <= 4) {
            System.out.println("You are now the lightest person in history");
            this.weight = weight;
        } else {
            this.weight = weight;
        }
    }

    /**
     * A method to set the shirt of the character
     * @param shirt shirt for the character
     */
    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    /**
     * A method to set the pants of the character
     * @param pants pants for the character
     */
    public void setPants(String pants) {
        this.pants = pants;
    }

    /**
     * A method to set the shoes of the character
     * @param shoes shoes for the character
     */
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    /**
     * A method to set the accessories list of the character
     * @param accessories accessories for the character
     */
    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }

}
