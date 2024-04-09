public class MainProgram {
    
    public static void main(String[] args) {
        // Apple object (instance)
        Apple apple = new Apple(FruitSize.LARGE, "Red", "Old");

        System.out.println("Apple object data");
        System.out.println(apple.getSize());
        System.out.println(apple.getColor());
        System.out.println(apple.getAge());

        // Car object (instance)
        Car car = new Car(1202, "Toyota", "Red", 60000);

        System.out.println("Car object data");
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getCost());

        // GameCharacter object (instance)
        GameCharacter character = new GameCharacter("Super Man", 30, 75, 250);

        System.out.println("GameCharacter object data");
        System.out.println(character.getName());
        System.out.println(character.getAge());
        System.out.println(character.getHeight());
        System.out.println(character.getWeight());
    }
}
