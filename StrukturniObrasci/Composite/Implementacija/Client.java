package StrukturniObrasci.Composite.Implementacija;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {

// Kreiranje strukture stabla
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);
        root.add(new Leaf("Leaf C"));
// Dodavanje i izbacivanje listova

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
// Rekurzivni prikaz stabla
        root.display(1);

    }
}
