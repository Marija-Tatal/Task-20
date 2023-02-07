package HW20;

public class Employee {
    String name;
    int id;

    Employee(String name,int id){
        this.name= name;
        this.id=id;
    }
}
class FullTime extends Employee {
    int hour;
    FullTime(String name, int id,int hour){
        super(name,id);
        this.hour=hour;
    }
    void work(){
        System.out.println(super.name+ "work in full Time in week");
    }

}
class PartiTime extends Employee{
    int halfH;
    PartiTime(String name, int id, int halfH){
        super(name, id);
        this.halfH=halfH;
    }
    void work1(){
        System.out.println(super.name +"work in Parti Time in week");
    }
}
class Tester extends FullTime{
    int hours;
    Tester(String name, int id, int hour, int hours){
       super(name,id,hour);
       this.hours=hours;
    }
    void workLife(){
        System.out.println(name+ " "+id+ " will be has a salary "+(hour*hours));
    }

}
class Tester1 extends PartiTime{
    int halfI;
    Tester1(String name,int id, int halfI){
        super(name, id,halfI);
        this.halfI=halfI;
    }
    void halfWork(){
        System.out.println(name+ " " +id+ " will be has a salary "+(halfI*halfH));
    }
}

