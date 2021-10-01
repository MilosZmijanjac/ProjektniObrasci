package StrukturniObrasci.Decorator.Primjer;

public class Client {
    public static void main(String[] args) {
        Window simpleWindow=new SimpleWindow();
        HSBDecorator hsbDecorator=new HSBDecorator(simpleWindow);
        hsbDecorator.draw();
    }
}
