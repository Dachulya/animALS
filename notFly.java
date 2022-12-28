public class notFly extends bird{
    public notFly(String name,int yearsOld,String environment,String typeOfMovement){
        super(name,yearsOld,environment,typeOfMovement);}

    public  void moveAround(){
        System.out.println("гулять");

    }
    @Override
    public String toString() {
        return getName()+"  "+getYearsOld()+"  "+getEnvironment()+ "  "+getTypeOfMovement();
    }
}
