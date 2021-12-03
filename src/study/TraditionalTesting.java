package study;

import java.util.ArrayList;
import java.util.List;

public class TraditionalTesting {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("tortoise",false,true));
        animals.add(new Animal("dog",false,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("deer",true,true));

        System.out.println("Hoppers: ");
        //print(animals, new CheckIfHopper());
        print(animals, Animal::canHop);
        System.out.println("Swimmers: ");
        //print(animals, new CheckIfSwimmer());
        print(animals, Animal::canSwim);
    }

    public static void print(List<Animal> list, CheckTrait check) {
        for(Animal a: list) {
            if(check.test(a)) {
                System.out.println(a + " ");
            }
        }
    }
}
