import java.util.Objects;

public class Herbivore extends mammal{
    private String typeEat;

    public Herbivore(String name,int yearsOld,String environment,int speed,String typeEat){
        super(name,yearsOld,environment,speed);
        this.typeEat=typeEat;
}public  void eat(){
        System.out.println("Пастись");

    }

    public String getTypeEat() {
        return typeEat;
    }

    @Override
    public String toString() {
        return getName()+"  "+getYearsOld()+"  "+getEnvironment()+"  "+getSpeed() + "  "+getTypeEat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return typeEat.equals(herbivore.typeEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeEat);
    }
}
