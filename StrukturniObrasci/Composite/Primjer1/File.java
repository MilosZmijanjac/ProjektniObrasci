package StrukturniObrasci.Composite.Primjer1;

public class File implements FSItem{
    private String name;
    public File(String name){
        this.name=name;
    }
    @Override
    public void printName() {
        System.out.println(name);
    }
}
