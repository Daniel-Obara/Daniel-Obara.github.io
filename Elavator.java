import java.util.ArrayList;

class Elevator {
    private int weight_limit;
    private int total_weight;
    private ArrayList<Person> persons;

    public Elevator() {
        weight_limit = 0;
        total_weight = 0;
        persons = new ArrayList<Person>();
    }

    public void setWeightLimit(int weight) {
        this.weight_limit = weight;
    }

    public void setTotalWeight(int total) {
        this.total_weight = total;
    }

    public String getInfo() {
        String result = "Weight Limit = " + weight_limit + "\n Total Weight = " + total_weight + "\n";
        for (int i = 0; i < persons.size(); i++) {
            result += persons.get(i).getInfo();
        }
        return result;
    }

    public boolean addPerson(String name, int weight) {
        if ((total_weight + weight) < weight_limit) {
            persons.add(new Person(name, weight));
            this.total_weight += weight;
            return true;
        }
        return false;
    }
}
