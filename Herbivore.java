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
}
