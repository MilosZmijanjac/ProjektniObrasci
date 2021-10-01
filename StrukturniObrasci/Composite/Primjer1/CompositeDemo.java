package StrukturniObrasci.Composite.Primjer1;

public class CompositeDemo {
    public static void main(String[] args) {
        Directory photos= new Directory("Photos");
        Directory summer=new Directory("Summer");
        summer.addItem(new File("File1.jpg"));
        summer.addItem(new File("File2.jpg"));
        photos.addItem(summer);
        photos.printDir();
    }
}
