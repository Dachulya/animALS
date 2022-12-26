public class mammal extends Animal{
    private String environment;
    private int speed;
    public mammal(String name,int yearsOld,String environment,int speed){
        super(name,yearsOld);
        this.environment=environment;
        this.speed=speed;
    }


    

    @Override
    public  void moveAround(){

    }
    @Override
    public  void eat(){

    }
    @Override
    public  void sleep(){

    }


    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
