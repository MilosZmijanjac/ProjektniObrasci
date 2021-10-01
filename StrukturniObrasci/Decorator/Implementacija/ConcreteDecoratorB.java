package StrukturniObrasci.Decorator.Implementacija;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("ConcreteDecoratorB operation()");
    }
    public void addedBehavior(){
        System.out.println("Added behavior");
    }
}
