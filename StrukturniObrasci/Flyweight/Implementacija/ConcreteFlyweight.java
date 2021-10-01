package StrukturniObrasci.Flyweight.Implementacija;

public class ConcreteFlyweight implements Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("ConcreteFlyweight "+extrinsicstate);
    }
}
