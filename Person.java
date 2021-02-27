class Person {
    private String name;
    private int weight;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getInfo() {
        return "Name = " + this.name + "\nWeight = " + this.weight + "\n";
    }
}