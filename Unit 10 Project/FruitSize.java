public enum FruitSize {
    SMALL (1),
    MEDIUM (2),
    LARGE (3);

    // instance field
    private int size;

    /**
     * An enum constructor to associate ints to sizes SMALL, MEDIUM, and LARGE
     * @param size size value for enum names
     */
    FruitSize(int size) {
        this.size = size;
    }

    /**
     * A method to retrieve the enum as a corresponding number value
     * @return enum size value
     */
    public int getNumberSize() {
        return size;
    }
}
