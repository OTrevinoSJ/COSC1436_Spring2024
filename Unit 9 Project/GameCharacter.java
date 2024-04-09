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

    // Three Constructors to construct differnt styles and additions of the objects
    GameCharacter(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        numOfNoClothesCharacters += 1;
    }

    GameCharacter(String name, int age, int height, int weight, String shirt, String pants, String shoes) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    GameCharacter(String name, int age, int height, int weight, String shirt, String pants, String shoes, String[] accessories) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
        this.accessories = accessories;
        numOfTotalAccessories += this.accessories.length;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getShirt() {
        return shirt;
    }

    public String getPants() {
        return pants;
    }

    public String getShoes() {
        return shoes;
    }

    public String[] getAccessories() {
        return accessories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }

}
