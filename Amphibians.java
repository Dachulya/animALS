public class Amphibians extends Animal{

    private String environment;
    public Amphibians(String name,int yearsOld,String environment){
        super(name,yearsOld);
        this.environment=environment;}
    public  void eat(){
        System.out.println("Охотиться");

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
    }



