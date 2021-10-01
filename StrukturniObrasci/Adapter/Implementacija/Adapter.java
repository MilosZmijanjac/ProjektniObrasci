package StrukturniObrasci.Adapter.Implementacija;

public class Adapter extends Target {
    private LegacyClass adaptee= new LegacyClass();
    @Override
    public void request(){
      adaptee.existingRequest();
    }
}
