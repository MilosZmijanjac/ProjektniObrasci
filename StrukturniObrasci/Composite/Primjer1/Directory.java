package StrukturniObrasci.Composite.Primjer1;

import java.util.ArrayList;

public class Directory implements FSItem{
    private String name;
    private ArrayList<FSItem> items;

    public Directory(String name){
        this.name=name;
        items=new ArrayList<>();
    }
    public void addItem(FSItem item){
        items.add(item);
    }
    @Override
    public void printName() {
        System.out.println(name);
    }

    public void printDir(){
        System.out.println(name+":");
        for(FSItem item :items)
            if(item instanceof Directory) {
                ((Directory) item).printDir();
            }
            else
            item.printName();
    }
}
