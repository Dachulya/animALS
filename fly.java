public class fly extends bird{
    public fly(String name,int yearsOld,String environment,String typeOfMovement){
        super(name,yearsOld,environment,typeOfMovement);}

    @Override
    public String toString() {
        return getName()+"  "+getYearsOld()+"  "+getEnvironment()+ "  "+getTypeOfMovement();
    }
    public  void moveAround(){
        System.out.println("Летать");
    }

}
