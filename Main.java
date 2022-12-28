public class Main {
    public static void main(String[] args) {
        Herbivore Gazel=new Herbivore("газель",3,"луга",245,"зелень");
        System.out.println(Gazel);
        Herbivore Guraf=new Herbivore("жираф",8,"луга",120,"зелень");
        System.out.println(Guraf);
        Herbivore Horse=new Herbivore("лошадь",4,"луга",100,"зелень");
        System.out.println(Horse);
        predator guena= new predator("гиена",1,"степи",34,"парнокопытные,падаль");
        predator tugr= new predator("тигр",2,"саванны",54,"парнокопытные");
        predator bear= new predator("медведь",3,"леса",24,"рыба,падаль");
        System.out.println(guena);
        System.out.println(tugr);
        System.out.println(bear);
        Amphibians frog=new Amphibians("Frog",1,"аквариум");
        Amphibians snake=new Amphibians("Уж",1,"аквариум");
        System.out.println(frog);
        System.out.println(snake);
        fly tea=new fly("Чайка",3,"Небо","Летает");
        fly teaBig=new fly("Альбатрос",4,"Небо","Летает");
        fly Sokol=new fly("Сокол",0,"Небо","Летает");
        notFly Pavlin= new notFly("Павлин",10,"кусты","ходит");
        notFly Pingvi= new notFly("пингвин",0,"ледники и берега","ходит");
        notFly DoDo= new notFly("до-до",7,"саванна","бегает");
        System.out.println(tea);
        System.out.println(teaBig);
        System.out.println(Sokol);
        System.out.println(Pavlin);
        System.out.println(Pingvi);
        System.out.println(DoDo);





    }
}