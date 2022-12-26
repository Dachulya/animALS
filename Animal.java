public abstract class Animal {
    private String name;
    private int yearsOld;
    public Animal(String name,int yearsOld){
        this.name=name;
        this.yearsOld=yearsOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }



    public abstract void eat();
    public abstract void sleep();
    public abstract void moveAround();
}
