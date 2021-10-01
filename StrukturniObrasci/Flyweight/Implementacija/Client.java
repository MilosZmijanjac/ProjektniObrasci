package StrukturniObrasci.Flyweight.Implementacija;

public class Client {
    public static void main(String[] args) {
        // Proizvoljno extrinsic stanje
        int extrinsicstate = 22;
        FlyweightFactory f = new FlyweightFactory();
// Rad sa različitim flyweight obrascima
        Flyweight fx = f.GetFlyweight("X");
        fx.operation(--extrinsicstate);
        Flyweight fy = f.GetFlyweight("Y");
        fy.operation(--extrinsicstate);
        Flyweight fz = f.GetFlyweight("Z");
        fz.operation(--extrinsicstate);
        UnsharedConcreteFlyweight fu = new UnsharedConcreteFlyweight();
        fu.operation(--extrinsicstate);
    }
}
