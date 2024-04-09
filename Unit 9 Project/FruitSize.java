public enum FruitSize {
    // enum constants calling enum constructor
    SMALL (1),
    MEDIUM (2),
    LARGE (3);

    // instance field
    private int size;

    // Enun construtor
    FruitSize(int size) {
        this.size = size;
    }

    // Gets the actual number of sizes SMALL, MEDIUM, LARGE
    public int getNumberSize() {
        return size;
    }
}
