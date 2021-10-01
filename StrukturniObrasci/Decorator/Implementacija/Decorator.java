package StrukturniObrasci.Decorator.Implementacija;

public abstract class Decorator implements Component{
    private Component comp;

    public void setComponent(Component component){
        comp=component;
    }

    @Override
    public void operation() {
     comp.operation();
    }
}
