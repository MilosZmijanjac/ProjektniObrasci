package StrukturniObrasci.Facade.Implementacija;

public class Facade {
    SubsystemA a;
    SubsystemB b;
    SubsystemC c;
    public Facade(){
        a=new SubsystemA();
        b=new SubsystemB();
        c=new SubsystemC();
    }
    public void run(){
        a.operationA();
        b.operationB();
        c.operationC();
    }
}
