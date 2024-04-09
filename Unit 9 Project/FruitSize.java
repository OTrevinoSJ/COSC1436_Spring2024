public enum FruitSize {
    SMALL (1),
    MEDIUM (2),
    LARGE (3);

    private int size;

    FruitSize(int size) {
        this.size = size;
    }

    public int getNumberSize() {
        return size;
    }

    

}
