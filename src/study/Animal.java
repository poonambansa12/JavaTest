package study;

public class Animal {
    private String speciesName;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String name, boolean hopper, boolean swimmer) {
        speciesName = name;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return speciesName;
    }
}
