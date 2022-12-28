import java.util.Objects;

public class predator extends  mammal{
    private String typeEat;

    public predator(String name,int yearsOld,String environment,int speed,String typeEat){
        super(name,yearsOld,environment,speed);
        this.typeEat=typeEat;
    }
    public  void eat(){
        System.out.println("Охотиться");

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
        predator predator = (predator) o;
        return typeEat.equals(predator.typeEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeEat);
    }
}
