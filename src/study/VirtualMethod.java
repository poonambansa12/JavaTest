package study;

class Bird {
    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
    public Bird() {
        System.out.println("Bird1");
    }
    public Bird(int age) {
        System.out.println("Bird");
    }
}
public class VirtualMethod extends Bird {
    public String getName() {
        return "Peacock";
    }
    public VirtualMethod() {
        System.out.println("Virtual");
    }
    public static void main(String[] args) {
        new Bird(5);
    }
}
