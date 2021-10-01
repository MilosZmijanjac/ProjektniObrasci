package StrukturniObrasci.Adapter.Primjer;

public class Poligon extends Lik2D {
    private Mnogougaonik adaptee  = new Mnogougaonik();
    @Override
    public void povrsina(){
        adaptee.izracunajPovrsinu();
    }
}
