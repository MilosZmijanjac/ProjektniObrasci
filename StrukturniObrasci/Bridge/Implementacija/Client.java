package StrukturniObrasci.Bridge.Implementacija;

public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
// Postavi implementaciju i pozovi operaciju
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();
// Promeni implementaciju i pozovi operaciju
        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
