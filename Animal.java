import java.util.Objects;

public abstract class Animal {
    private String name;
    private int yearsOld;
    public Animal(String name,int yearsOld){
        this.name=name;
        this.yearsOld=yearsOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return yearsOld == animal.yearsOld && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearsOld);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void moveAround();
}
