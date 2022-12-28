import java.util.Objects;

public class Amphibians extends Animal{

    private String environment;
    public Amphibians(String name,int yearsOld,String environment){
        super(name,yearsOld);
        this.environment=environment;}
    public  void eat(){
        System.out.println("Охотиться");

    }
    @Override
    public String toString() {
        return getName()+"  "+getYearsOld()+"  "+getEnvironment();
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
        public  void sleep(){

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return environment.equals(that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment);
    }
}



