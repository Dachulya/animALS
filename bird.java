import java.util.Objects;

public class bird extends Animal{
    private String environment;
    private String typeOfMovement;

    public bird(String name,int yearsOld,String environment,String typeOfMovement){
        super(name,yearsOld);
        this.environment=environment;
        this.typeOfMovement=typeOfMovement;}


    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bird bird = (bird) o;
        return environment.equals(bird.environment) && typeOfMovement.equals(bird.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, typeOfMovement);
    }
}


