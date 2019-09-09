package org.kie.kogito.reproducer.model;
import java.util.function.Supplier;

/**
 * Person
 */
public class Person {

    private String name;

    private int age;

    private boolean canDrink;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCanDrink() {
        return canDrink;
    }

    public void setCanDrink(boolean canDrink) {
        this.canDrink = canDrink;
    }

    public void setCanDrinkLambda(Supplier<Boolean> supplier) {
        this.canDrink = supplier.get();
    }
    
}
