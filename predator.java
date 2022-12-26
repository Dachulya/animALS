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

}
